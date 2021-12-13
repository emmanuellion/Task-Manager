package Event;

import Window.*;
import EButton.EButton;
import Event.Parameters.Parameters;
import EventHandler.ReaderEvent;
import Window.Window;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.FileNotFoundException;

/**
 * Cette classe permet d'afficher les évènements sauvegardés
 * @author Emmanuel
*/
public class EventManager{
    private JScrollPane scroll;
    private BlocEvent bloc;
    private EButton modif, supprim;
    private Window _w;

    /**
     * Instanciation du JPanel contenant les JLabel correspondant aux différents évènements
     */
    private JPanel panelV = new JPanel();
    private JPanel panelH = new JPanel();

    /**
     * Instanciation d'un booléen permettant de savoir si les tâches contenu dans le fichier de base on étaient affichés
     */
    private boolean already_past = false;

    /**
     * Cette méthode est le constructeur de la classe 'EventManager" permettant d'ajouter le la donnée membre 'panel' à la fenêtre principale
     * @param __w Le paramètre '__w' correspond à l'instance de la fenêtre principal
     */
    public EventManager(Window __w){
        //_w.add(panel);
        _w = __w;
        //_w.add(scroll);
        panelH.setLayout(new FlowLayout());
        panelV.setLayout(new BoxLayout(panelV, BoxLayout.PAGE_AXIS));
    }

    /**
     * Cette méthode permet de rafraichîr l'affichage des différents évènements à afficher
     * @author Emmmanuel
     */
    public void refresh(){
        System.out.println("into here");
        ListEvent list = new ReaderEvent().get_data();
        panelV.setBorder(LineBorder.createBlackLineBorder());
        if(!already_past) {
            for (int i = 0; i < list.size(); i++) {
                /*JLabel txt = new JLabel(list.get(i));
                txt.setBounds(515, 100 + i * 50, 250, 50);
                txt.setBackground(new Color(200, 0, 255));
                panel.add(txt);*/
                bloc = new BlocEvent(list.getTask(i), 150, 150, 150);
                modif = new EButton("Modifier", 500, 0, 100, 500, 255, 255, 255);
                supprim = new EButton("Supprimer", 600, 0, 100, 500, 255, 255, 255);
                panelH.removeAll();
                panelH.add(bloc);
                panelH.add(modif);
                int tmp = i;
                supprim.addActionListener(evt -> {
                    list.erase(tmp);
                });
                modif.addActionListener(evt -> {
                    try {
                        new Modification_evenement(new Parameters(), _w, this, list.getTask(tmp));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                });
                panelH.add(supprim);
                panelV.add(panelH);
            }
            already_past = true;
        }else{
            /*JLabel txt = new JLabel(list.get(list.size()-1));
            txt.setBounds(515, 100 + list.size() * 50, 250, 50);
            txt.setBackground(new Color(200, 0, 255));
            panel.add(txt);*/
            bloc = new BlocEvent(list.getTask(list.size()-1),150, 150, 150);
            panelH.removeAll();
            panelH.add(bloc);
            panelH.add(modif);
            panelH.add(supprim);
            supprim.addActionListener(evt -> {
                list.erase(list.size()-1);
            });
            modif.addActionListener(evt -> {
                try {
                    new Modification_evenement(new Parameters(), _w, this, list.getTask(list.size()-1));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });
            panelV.add(panelH);
        }
        scroll  = new JScrollPane(panelV,   ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize(new Dimension(700, 600));
        scroll.setEnabled(true);
        scroll.setWheelScrollingEnabled(true);
    }

    /**
     * Cette méthode permet d'obtenir l'objet JPanel affichant les différents évènements
     * @author Emmanuel
     * @return Un objet JPanel correspondant au JPanel affichant les évènements
     */
    public JPanel getPanel(){
        return panelV;
    }

    /**
     * Cette méthode permet de modifier l'objet JPanel affichant les différents évènements
     * @author Emmanuel
     */
    public void setPanel(JPanel _panel){
        panelV = _panel;
    }
}
