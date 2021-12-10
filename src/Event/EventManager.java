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
    private JPanel panel = new JPanel(new FlowLayout());
    private boolean already_past = false;

    public EventManager(Window _w){
        _w.add(panel);
    }

    public void go(){
        System.out.println("into here");
        ListEvent list = new ReaderEvent().get_data();
        if(!already_past) {
            for (int i = 0; i < list.size(); i++) {
                JLabel txt = new JLabel(list.get(i));
                txt.setBounds(515, 100 + i * 50, 250, 50);
                txt.setBackground(new Color(200, 0, 255));
                panel.add(txt);
            }
            already_past = true;
        }else{
            JLabel txt = new JLabel(list.get(list.size()-1));
            txt.setBounds(515, 100 + list.size() * 50, 250, 50);
            txt.setBackground(new Color(200, 0, 255));
            panel.add(txt);
        }
    }

    public JPanel getPanel(){
        return panel;
    }

    public void setPanel(JPanel _panel){
        panel = _panel;
    }
}
