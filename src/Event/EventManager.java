package Event;

import EventHandler.SaveEvent;
import Window.*;
import EButton.EButton;
import Event.Parameters.Parameters;
import EventHandler.ReaderEvent;
import Window.Window;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

/**
 * Cette classe permet d'afficher les évènements sauvegardés
 * @author Emmanuel
*/
public class EventManager{
    private JScrollPane scroll;
    private JPanel panelV = new JPanel();
    private JPanel panelH = new JPanel();
    private BlocEvent bloc;
    private EButton modif, supprim;
    private Window _w;
    private Vector<JPanel> save = new Vector<>();

    /**
     * Instanciation du JPanel contenant les JLabel correspondant aux différents évènements
     */


    /**
     * Instanciation d'un booléen permettant de savoir si les tâches contenu dans le fichier de base on étaient affichés
     */
    private boolean already_past = false;

    /**
     * Cette méthode est le constructeur de la classe 'EventManager" permettant d'ajouter le la donnée membre 'panel' à la fenêtre principale
     * @param __w Le paramètre '__w' correspond à l'instance de la fenêtre principal
     */
    public EventManager(Window __w){
        scroll = new JScrollPane(panelV, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setPreferredSize(new Dimension(700, 600));
        scroll.setEnabled(true);
        scroll.setWheelScrollingEnabled(true);
        panelH.setLayout(new FlowLayout());
        panelV.setLayout(new BoxLayout(panelV, BoxLayout.PAGE_AXIS));
        panelV.setBounds(0, 0, 700, 600);
        //scroll.add(panelH);
        //scroll.add(panelV);
        scroll.setBounds(100, 100, 700, 600);
        _w = __w;
        _w.add(panelV);
        //_w.add(scroll);
    }

    /**
     * Cette méthode permet de rafraichîr l'affichage des différents évènements à afficher
     * @author Emmmanuel
     */
    public void refresh(){
        System.out.println("===");
        ListEvent list = new ReaderEvent().get_data();
        panelV.setBorder(LineBorder.createBlackLineBorder());
        if(!already_past) {
            for (int i = 0; i < list.size(); i++) {
                panelH = new JPanel(new FlowLayout());
                //panelH.setBounds(0, 0, 500, 500);
                JLabel txt = new JLabel(list.get(i));
                txt.setBounds(50, i*10, 250, 50);
                txt.setBackground(new Color(200, 0, 0));
                panelH.add(txt);
                //bloc = new BlocEvent(list.getTask(i), 150, 150, 150);
                modif = new EButton("Modifier", 0, 0, 100, 100, 255, 255, 255);
                supprim = new EButton("Supprimer", 0, 0, 100, 100, 255, 255, 255);
                //panelH.add(bloc);
                panelH.add(modif.get());
                panelH.add(supprim.get());
                int tmp = i;
                modif.addActionListener(evt -> {
                    try {
                        new Modification_evenement(new Parameters(), _w, this, list.getTask(tmp));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                });
                supprim.addActionListener(evt -> {
                    list.erase(tmp);
                    try {
                        new SaveEvent().save(list);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                panelV.add(panelH);
            }
            already_past = true;
        }else{
            panelH = new JPanel(new FlowLayout());
            //panelH.setBounds(0, 0, 500, 500);
            JLabel txt = new JLabel(list.get(list.size()-1));
            txt.setBounds(50, list.getLastIndex()*10, 250, 50);
            txt.setBackground(new Color(200, 0, 0));
            panelH.add(txt);
            //bloc = new BlocEvent(list.getTask(i), 150, 150, 150);
            modif = new EButton("Modifier", 0, 0, 100, 100, 255, 255, 255);
            supprim = new EButton("Supprimer", 0, 0, 100, 100, 255, 255, 255);
            //panelH.add(bloc);
            panelH.add(modif);
            panelH.add(supprim);
            int tmp = list.getLastIndex();
            modif.addActionListener(evt -> {
                try {
                    new Modification_evenement(new Parameters(), _w, this, list.getTask(tmp));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });
            supprim.addActionListener(evt -> {
                list.erase(tmp);
                try {
                    new SaveEvent().save(list);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            panelV.add(panelH);
        }
        _w.pack();
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
