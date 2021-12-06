package Event;

import java.util.*;
import java.lang.*;

/**
 * Cette classe permet de stocker une liste d'évènements (représentées par des objets 'Event')
 * @author Evan
 */
public class ListEvent {
    /**
     * Instanciation du vecteur visant à contenir toutes les évènements
     */
    private Vector<Event> l = new Vector<>(0);
    //static private final Calendar annee = new GregorianCalendar();

    /**
     * Cette méthode permet de récupérer le contenu d'un évènements à la i<i>ème</i> position dans le tableau des évènements
     * @author Evan
     * @param index Le paramètre 'index' correspond à l'index de l'évènement dont nous voulons les informations
     * @return Une chaîne de caractères représentation le contenu de l'évènement
     */
    public String get(int index) {
        return l.get(index).getInfos();
    }

    /**
     * Cette méthode permet de récupérer l'objet même d'une tâche à la i<i>ème</i> position dans le tableau des évènements
     * @author Evan
     * @param index Le paramètre 'index' correspond à l'index de l'évènement que nous voulons récupérer
     * @return Un objet 'Event'
     */
    public Event getTask(int index){ return l.get(index); }

    /**
     * Cette méthode permet de retourner la taille de la liste des évènements
     * @return Un entier correspondant à la taille de la liste
     */
    public int size() {
        return l.size();
    }

    /**
     * Cette méthode permet de rajouter un objet 'Event' dans la liste
     * @author Evan et Emmanuel
     * @param tit Le paramètre 'tit' correspond au titre de l'évènement
     * @param cat Le paramètre 'cat' correspond à la catégorie de l'évènement
     * @param desc Le paramètre 'desc' correspond à la description de l'évènement
     * @param b_d Le paramètre 'b_d' correspond au jour de début de l'évènement
     * @param b_h Le paramètre 'b_h' correspond à l'heure de début de l'évènement
     * @param e_d Le paramètre 'e_d' correspond au jour de fin de l'évènement
     * @param e_h Le paramètre 'e_h' correspond à l'heure de fin de l'évènement
     * @param imp Le paramètre 'imp' correspond à l'importance de l'évènement
     */
    public void add(String tit, String cat, String desc, String b_d, String b_h, String e_d, String e_h, String imp) {
        l.add(new Event(tit, cat, desc, b_d, b_h, e_d, e_h, imp));
    }

    /**
     * Cette méthode permet de supprimer un évènement se positionnant à la i<i>ème</i> position dans le tableau
     * @author Evan
     * @param index Le paramètre 'index' correspond à l'index de l'évènement à supprimer
     */
    public void del(int index) {
        l.remove(index);
    }

    /**
     * Cette méthode permet de retourner une liste trié en fonction des paramètres renseignés
     * @author Emmanuel
     * @param index Le paramètre 'index' correspond à une chaîne de caractères permettant de trier les évènements sur un critère d'appartenance (que ce soit de catégorie ou d'importance)
     * @param isCat Le paramètre 'isCat' correspond à un booléen visant à choisir si nous voulons récupérer les évènements en fonction de l'appartenance à une catégorie ou en fonction de leur importance
     * @return Un vecteur d'<i>Event</i> correspondant à la liste triée des évènements selon les critères passés en paramètres
     */
    public Vector<Event> getByOptions(String index, boolean isCat){
        Vector<Event> listFromThisOpt = new Vector<>();
        for(Event t : l){
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