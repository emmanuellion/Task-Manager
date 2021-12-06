package Task;

import java.util.*;
import java.lang.*;

/**
 * Cette classe permet de stocker une liste de tâches (représentées par des objets 'Task')
 * @author Evan
 */
public class ListTask {
    /**
     * Instaciation du vecteur visant à contenir toutes les tâches
     */
    private Vector<Task> l = new Vector<>(0);
    //static private final Calendar annee = new GregorianCalendar();

    /**
     * Cette méthode permet de récupérer le contenu d'une tâche à la ième position dans le tableau de tâches
     * @author Evan
     * @param index Le paramètre 'index' correspond à l'index de la tâche dont nous voulons les informations
     * @return Une chaîne de caractères représentation le contenu de la tâche
     */
    public String get(int index) {
        return l.get(index).getInfos();
    }

    /**
     * Cette méthode permet de récupérer l'objet même d'une tâche à la ième position dans le tableau des tâches
     * @author Evan
     * @param index Le paramètre 'index' correspond à l'index de la tâche que nous voulons récupérer
     * @return Un objet 'Task'
     */
    public Task getTask(int index){ return l.get(index); }

    /**
     * Cette méthode permet de retourner la taille de la liste des tâches
     * @return Un entier correspondant à la taille de la liste
     */
    public int size() {
        return l.size();
    }

    /**
     * Cette méthode permet de rajouter un objet 'Task' dans la liste
     * @author Evan & Emmanuel
     * @param tit Le paramètres 'tit' correspond au titre de la tâcje
     * @param cat Le paramètres 'cat' correspond à la catégorie de la tâche
     * @param desc Le paramètres 'desc' correspond à la description de la tâche
     * @param b_d Le paramètres 'b_d' correspond au jour de début de la tâche
     * @param b_h Le paramètres 'b_h' correspond à l'heure de début de la tâche
     * @param e_d Le paramètres 'e_d' correspond au jour de fin de la tâche
     * @param e_h Le paramètres 'e_h' correspond à l'heure de fin de la tâche
     * @param imp Le paramètres 'imp' correspond à l'importance de la tâche
     */
    public void add(String tit, String cat, String desc, String b_d, String b_h, String e_d, String e_h, String imp) {
        l.add(new Task(tit, cat, desc, b_d, b_h, e_d, e_h, imp));
    }
    //
    public void del(int index) {
        l.remove(index);
    }
    //
    public Vector<Task> getByOptions(String index, boolean isCat){
        Vector<Task> listFromThisOpt = new Vector<>();
        for(Task t : l){
            if(isCat)
                if(Objects.equals(t.getCat(), index))
                    listFromThisOpt.add(t);
            else
                if(Objects.equals(t.getImp(), index))
                    listFromThisOpt.add(t);

        }
        return listFromThisOpt;
    }
}