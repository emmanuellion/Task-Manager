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
    //private JPanel panel = new JPanel(new FlowLayout());
    private JScrollPane scroll;
    private JPanel panel = new JPanel(new BoxLayout());
    private BlocEvent bloc;
    private boolean already_past = false;

    public EventManager(Window _w){
        //_w.add(panel);
        _w.add(scroll);
    }

    public void go(){
        System.out.println("into here");
        ListEvent list = new ReaderEvent().get_data();
        panel.setBorder(LineBorder.createBlackLineBorder());
        if(!already_past) {
            for (int i = 0; i < list.size(); i++) {
                /*JLabel txt = new JLabel(list.get(i));
                txt.setBounds(515, 100 + i * 50, 250, 50);
                txt.setBackground(new Color(200, 0, 255));
                panel.add(txt);*/
                bloc = new BlocEvent(list.getTask(i));
                panel.add(bloc);
            }
            already_past = true;
        }else{
            /*JLabel txt = new JLabel(list.get(list.size()-1));
            txt.setBounds(515, 100 + list.size() * 50, 250, 50);
            txt.setBackground(new Color(200, 0, 255));
            panel.add(txt);*/
            bloc = new BlocEvent(list.getTask(list.size()-1));
            panel.add(bloc);
        }
        scroll  = new JScrollPane(panel,   ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setPreferredSize(new Dimension(600, 600));
    }

    public JPanel getPanel(){
        return panel;
    }

    public void setPanel(JPanel _panel){
        panel = _panel;
    }
}
