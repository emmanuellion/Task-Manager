package Event.Parameters;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Cette classe permet de charger toutes les catégories prisent en charge par le logiciel
 * @author Emmanuel
 */
public class Parameters {

    /**
     * Instanciation du vecteur visé à contenir toutes les catégories
     */
    private static Vector<String> listCategory = new Vector<>();

    /**
     * Instanciation du vecteur visé à contenir toutes les importances plausibles
     */
    private static Vector<String> listImportance = new Vector<>();

    /**
     * Instanciation de l'objet 'File' correspondant au fichier config.ev
     */
    private static final File f = new File("src/config.ev");

    /**
     * Cette méthode permet de stocker les catégories prisent en charge lors de l'instanciation de la classe
     * @author Emmanuel
     * @throws FileNotFoundException Déclenché si le fichier n'est pas trouvé dans le chemin indiqué
     */
    public Parameters() throws FileNotFoundException {
        update();
    }

    /**
     * Cette méthode permet de stocker su le fichier config.ev les nouvelles catégories ainsi que de mettre à jour les données membres
     * @author Emmanuel
     * @throws FileNotFoundException Déclenché si le fichier n'est pas trouvé dans le chemin indiqué
     */
    public void update() throws FileNotFoundException {
        try (Scanner scan = new Scanner(f)) {
            int nb_line = 0;
            listCategory = new Vector<>();
            listImportance = new Vector<>();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (!Objects.equals(line, "")) {
                    StringBuilder builder = new StringBuilder();
                    for (String car : line.split("")) {
                        if (!Objects.equals(car, "~")) {
                            builder.append(car);
                        } else {
                            if(nb_line == 0)
                                listCategory.add(builder.toString());
                            else if(nb_line == 1)
                                listImportance.add(builder.toString());
                            builder = new StringBuilder();
                        }
                    }
                }
                nb_line++;
            }
        }
    }

    /**
     * Cette méthode permet de sauvegarder dans le fichier config.ev une liste de catégorie passée en paramètre
     * @author Emmanuel
     * @param list Le paramètre 'list' correspond à une liste de catégorie à sauvegarder sur le fichier
     * @throws IOException Déclenché s'il y a un problème lors de l'écriture dans le fichier congif.ev
     */
    public void save(Vector<String> list) throws IOException {
        if((f.exists())) {
            FileWriter write = new FileWriter(f, false);
            for (String s : list) {
                write.write(s);
                write.append("~");
            }
            write.append("\n");
            for(String z : listImportance){
                write.write(z);
                write.append("~");
            }
            write.close();
            update();
        } else {
            System.out.println("Le fichier config.ev a été supprimé ou déplacé, veuillez le restaurer ou le replacer.");
        }
    }

    /**
     * Cette méthode permet d'obtenir le vecteur comprenant les catégories
     * @author Emmanuel
     * @return Un vecteur comprenant toutes les catégories prisent en charge
     */
    public Vector<String> getCat() {return listCategory;}

    /**
     * Cette méthode permet d'obtenir le vecteur comprenant les importances plausibles
     * @author Emmanuel
     * @return Un vecteur comprenant toutes les importances plausibles
     */
    public Vector<String> getImp() {return listImportance;}

    /**
     * Cette méthode permet de récupérer une catégorie à la i<i>ème</i> place dans la liste des catégories
     * @author Emmanuel
     * @param index Le paramètre 'index' correspond à l'index de la catégorie que l'on veut récupérer
     * @return Une chaîne de caractère correspondant à la catégorie
     */
    public String getFromCat(int index){return listCategory.get(index);}

    /**
     * Cette méthode permet de récupérer une importance à la i<i>ème</i> place dans la liste des importances
     * @author Emmanuel
     * @param index Le paramètre 'index' correspond à l'index de l'importance que l'on veut récupérer
     * @return Une chaîne de caractère correspondant à l'importance
     */
    public String getFromImp(int index){return listImportance.get(index);}
}