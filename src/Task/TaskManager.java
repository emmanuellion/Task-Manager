package Task;

import EventHandler.ReaderEvent;
import Window.Window;
import javax.swing.*;
import java.awt.*;

/**
 * Cette classe permet d'afficher les tâches sauvegardées
 * @author Emmanuel
 */
public class TaskManager {
    private  Window w = null;

    public TaskManager(Window _w){
        w = _w;
    }

    public void go(){
        ListTask list = new ReaderEvent().get_data();
        for(int i = 0; i < list.size(); i++){
            JTextArea txt = new JTextArea(list.get(i));
            txt.setBounds(700,100+i*50,200,50);
            txt.setBackground(new Color(255,0,0));
            w.add(txt);
        }
    }
}
