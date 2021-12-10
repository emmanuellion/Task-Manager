package Event;

import EventHandler.ReaderEvent;
import Window.Window;
import javax.swing.*;
import java.awt.*;

/**
 * Cette classe permet d'afficher les évènements sauvegardés
 * @author Emmanuel
 */
public class EventManager extends Thread{
    private  Window w = null;
    private ListEvent list;
    private int old_size = 0;

    public EventManager(Window _w){
        w = _w;
    }

    @Override
    public void run() {
        super.run();
        try {
            go();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void go() throws InterruptedException {
        list = new ReaderEvent().get_data();
        while(true){
            if(old_size != list.size())
                for(int i = 0; i < list.size(); i++){
                    JTextArea txt = new JTextArea(list.get(i));
                    txt.setBounds(700,100+i*50,200,50);
                    txt.setBackground(new Color(255,0,0));
                    w.add(txt);
                }
            old_size = list.size();
            Thread.sleep(1000);
        }
    }

    public ListEvent getList(){
        return list;
    }
}
