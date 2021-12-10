package Event;

import EventHandler.ReaderEvent;
import Window.Window;
import javax.swing.*;
import java.awt.*;

/**
 * Cette classe permet d'afficher les évènements sauvegardés
 * @author Emmanuel
*/
public class EventManager{
    private  Window w = null;

    public EventManager(Window _w){
        w = _w;
    }

    public void go(){
        ListEvent list = new ReaderEvent().get_data();
        for(int i = 0; i < list.size(); i++){
            JTextArea txt = new JTextArea(list.get(i));
            txt.setBounds(515,100+i*50,250,50);
            txt.setBackground(new Color(200, 0, 255));
            w.add(txt);
        }
    }
}
