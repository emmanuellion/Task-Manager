import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

public class ListTask {
    //
    private Vector<Task> l;
    private Task t;
    // Variables nécessaires pour ajout()
    /*static private final Scanner scan = new Scanner(System.in);
    static private final Vector<String> category_list = new Vector<String>(0);
    static private final String[] importance_list = {"Nulle", "Très faible", "Faible", "Moyenne", "Élevée", "Urgent", "ASAP"};
    static private Pattern pat_check;
    static private Matcher mat_check;
    static private boolean bool_check;
    static private boolean verif = false, verif2 = false;
    static private String cat, imp, d, h, fonc;
    static private int compt_erreur;*/
    static private final Calendar annee = new GregorianCalendar();
    // Variables nécessaires pour sauvegarder()
    /*private static File f;
    private static BufferedWriter FW;
    private static BufferedReader FR;*/

    ListTask() {
        l = new Vector<>(0);
    }
    //
    public String get(int index) {
        return l.get(index).getInfos();
    }
    //
    public int taille() {
        return l.size();
    }
    //
    public void ajoutTache(String tit, String cat, String desc, String b_d, String b_h, String e_d, String e_h, String imp) {
        /*verif = false;
        verif2 = false;
        do {
            //Saisie de la catégorie de l'évènement
            System.out.println("\nPour commencer, veuillez saisir la catégorie de votre tâche >");
            cat = scan.next();
            compt_erreur = 0;
            for(int i=0; i<category_list.size(); i++) {
                if(!(cat.equals(category_list.get(i)))) {
                    compt_erreur++;
                }
            }
            if(compt_erreur==category_list.size()) {
                System.out.println("Votre catégorie n'existe pas ou à mal été saisie.\nVoulez-vous ajouter cette catégorie à la liste (ajoutCategorie) ou bien ressaisir le nom (ressaisie) ?");
                do {
                    fonc = scan.next();
                    if((fonc.equals("ajoutCategorie"))) {
                        category_list.add(cat);
                        System.out.println("Catégorie ajoutée à la liste, on peut poursuivre la création de l'évènement.\n");
                        //this.category = cat;
                        verif = true;
                        verif2=true;
                    } else if ((fonc.equals("ressaisie"))) {
                        verif2=true;
                    } else {
                        System.out.println("Veuillez saisir un nom de fonction correct.\n");
                    }
                } while(verif2==false);
            } else {
                verif=true;
            }
        } while(verif==false);
        verif = false;
        compt_erreur = 0;
        // Choix de l'importance
        do {
            System.out.println("\nEnsuite, il vous faut saisir l'importance de la tâche. La liste des degrès d'importance est donnée ci-dessous :");
            for(int i = 0; i<importance_list.length; i++) {
                System.out.println("    " + importance_list[i]);
            }
            System.out.println(">");
            imp = scan.next();
            for(int i=0; i<importance_list.length; i++) {
                if(!(imp.equals(importance_list[i]))) {
                    compt_erreur++;
                }
            }
            if(compt_erreur==importance_list.length) {
                System.out.println("Importance mal saisie, veuillez saisir une valeur correcte.\n");
            } else {
                verif = true;
            }
        } while(verif==false);
        verif = false;
        String[] check = new String[3];
        int check_j;
        int check_m;
        int check_a;
        pat_check = Pattern.compile("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]");
        // Choix de la date
        do {
            System.out.println("\nMaintenant, saisissez la date de votre tâche(jj/mm/aa) >");
            d = scan.next();
            mat_check = pat_check.matcher(d);
            bool_check = mat_check.matches();
            if(!(bool_check)) {
                System.out.println("La date n'a pas été saisie sous le bon format, veuillez recommencer.\n");
            } else {
                check = d.split("/");
                check_j = Integer.parseInt(check[0]);
                check_m = Integer.parseInt(check[1]);
                check_a = Integer.parseInt(check[2]);
                if(check_a>(annee.get(Calendar.YEAR)-10) && check_a<=(annee.get(Calendar.YEAR)+145)) {
                    if(check_j<1 || check_j>31) {
                        System.out.println("Veuillez saisir un jour correct.\n");
                    } else {
                        if(check_m>=1 && check_m<=12){
                            switch(check_m) {
                                case 1, 3, 5, 7, 8, 10, 12 :
                                    verif=true;
                                    break;
                                case 4, 6, 9, 11 :
                                    if(check_j==31) {
                                        System.out.println("Ce mois ci ne contient pas 31 jours.\n");
                                    } else {
                                        verif=true;
                                    }
                                    break;
                                case 2 :
                                    if(((check_a % 4 == 0) && (check_a % 100 != 0)) || (check_a % 400 == 0)) {
                                        if(check_j>29) {
                                            System.out.println("Ce mois ci ne contient pas plus de 29 jours (année bissextile).\n");
                                        } else {
                                            verif=true;
                                        }
                                    } else {
                                        if(check_j>28) {
                                            System.out.println("Ce mois ci ne contient pas plus de 28 jours.\n");
                                        } else {
                                            verif=true;
                                        }
                                    }
                                    break;
                            }
                        } else {
                            System.out.println("Veuillez saisir un mois correct.\n");
                        }
                    }
                } else {
                    System.out.println("L'année saisie ne rentre pas dans la borne autorisée (entre -10 ans de l'année actuelle ou + 145).\n");
                }
            }
        } while(verif==false);
        verif = false;
        String[] check_h = new String[2];
        int h_h;
        int h_m;
        pat_check = Pattern.compile("[0-9][0-9]:[0-9][0-9]");
        do {
            System.out.println("\nAprès ça, veuillez rentrer l'horaire de votre tâche comme ceci (HH:MM)>");
            h = scan.next();
            mat_check = pat_check.matcher(h);
            bool_check = mat_check.matches();
            if(!(bool_check)) {
                System.out.println("L'heure n'a pas été saisie sous le bon format, veuillez recommencer.\n");
            } else {
                check_h = h.split(":");
                h_h = Integer.parseInt(check_h[0]);
                h_m = Integer.parseInt(check_h[1]);
                if(h_h<0 || h_h>23) {
                    System.out.println("L'heure n'est pas bonne, veuillez la ressaisir.\n");
                } else {
                    if(h_m<0 || h_m>59) {
                        System.out.println("Les minutes n'est pas bonnes, veuillez les ressaisir.\n");
                    } else {
                        verif = true;
                    }
                }
            }
        } while(!verif);
        System.out.println("Pour finir, veuillez saisir le nom de votre tâche");
        fonc = scan.nextLine();
        fonc = scan.nextLine();
        //
        t = new Task(cat, imp, d, h, fonc);
        l.add(t);*/
        t = new Task(tit, cat, desc, b_d, b_h, e_d, e_h, imp);
        l.add(t);
    }
    //
    public void suppressionTache(int index) {
        l.remove(index);
    }
    //
    public static void main(String[] args) {
        ListTask liste_tache = new ListTask();
        /*liste_tache.ajout();
        liste_tache.get(0);
        liste_tache.sauvegarder();*/
    }
}