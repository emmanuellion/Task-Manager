package Event;

import EventHandler.ReaderEvent;
import Window.Window;
import javax.swing.*;
import java.awt.*;

/**
 * Cette classe permet d'afficher les évènements sauvegardés
 * @author Emmanuel
 */
public class EventManager {
    private  Window w = null;
    private ListEvent list;

    public EventManager(Window _w){
        w = _w;
    }

    public void go(){
        list = new ReaderEvent().get_data();
        for(int i = 0; i < list.size(); i++){
            JTextArea txt = new JTextArea(list.get(i));
            txt.setBounds(700,100+i*50,200,50);
            txt.setBackground(new Color(255,0,0));
            w.add(txt);
        }
    }

    public ListEvent getList(){
        return list;
    }
}
