package Event;

import Window.BlocEvent;

import EventHandler.ReaderEvent;
import Window.Window;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Cette classe permet d'afficher les évènements sauvegardés
 * @author Emmanuel
*/
public class EventManager{
    private JScrollPane scroll;
    private BlocEvent bloc;

    /**
     * Instanciation du JPanel contenant les JLabel correspondant aux différents évènements
     */
    private JPanel panel = new JPanel();

    /**
     * Instanciation d'un booléen permettant de savoir si les tâches contenu dans le fichier de base on étaient affichés
     */
    private boolean already_past = false;

    /**
     * Cette méthode est le constructeur de la classe 'EventManager" permettant d'ajouter le la donnée membre 'panel' à la fenêtre principale
     * @param _w Le paramètre '_w' correspond à l'instance de la fenêtre principal
     */
    public EventManager(Window _w){
        //_w.add(panel);
        _w.add(scroll);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    }

    /**
     * Cette méthode permet de rafraichîr l'affichage des différents évènements à afficher
     * @author Emmmanuel
     */
    public void refresh(){
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

    /**
     * Cette méthode permet d'obtenir l'objet JPanel affichant les différents évènements
     * @author Emmanuel
     * @return Un objet JPanel correspondant au JPanel affichant les évènements
     */
    public JPanel getPanel(){
        return panel;
    }

    /**
     * Cette méthode permet de modifier l'objet JPanel affichant les différents évènements
     * @author Emmanuel
     */
    public void setPanel(JPanel _panel){
        panel = _panel;
    }
}
