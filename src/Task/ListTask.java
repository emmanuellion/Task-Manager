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
    public Task getTask(int index){ return l.get(index); }
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