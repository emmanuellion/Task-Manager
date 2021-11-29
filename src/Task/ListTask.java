package Task;

import java.util.*;
import java.lang.*;

public class ListTask {
    private Vector<Task> l;
    static private Vector<String> listCat;
    //static private final Calendar annee = new GregorianCalendar();

    public ListTask() {
        l = new Vector<>(0);
    }
    //
    public String get(int index) {
        return l.get(index).getInfos();
    }
    //
    public int size() {
        return l.size();
    }
    //
    public void add(String tit, String cat, String desc, String b_d, String b_h, String e_d, String e_h, String imp) {
        l.add(new Task(tit, cat, desc, b_d, b_h, e_d, e_h, imp));
    }
    //
    public void del(int index) {
        l.remove(index);
    }
    //
    public void ajoutCat(String hey) {
        int compteur=0;
        for(int i = 0; i<listCat.length(); i++) {
            if(hey.isEqual(listCat.at(i))) {
                compteur++;
            }
        }
        if(compteur==listCat.length()) {
            listCat.add(hey);
        } else {
            System.out.println("Catégorie déjà existante !");
        }
    }
}