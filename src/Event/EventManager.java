package Event;

import EButton.EButton;
import Event.Parameters.Parameters;
import EventHandler.ReaderEvent;
import EventHandler.SaveEvent;
import Window.BlocEvent;
import Window.Modification_evenement;
import Window.Window;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;

/**
 * Cette classe permet d'afficher les évènements sauvegardés
 * @author Emmanuel
*/
public class EventManager{
    private JPanel panelV = new JPanel();
    private JPanel panelH = new JPanel();
    private BlocEvent bloc;
    private JButton modif, supprim;
    private Window _w;

    /**
     * Instanciation du JPanel contenant les JLabel correspondant aux différents évènements
     */


    /**
     * Cette méthode est le constructeur de la classe 'EventManager" permettant d'ajouter le la donnée membre 'panel' à la fenêtre principale
     * @param __w Le paramètre '__w' correspond à l'instance de la fenêtre principal
     */
    public EventManager(Window __w){
        _w = __w;
    }

    /**
     * Cette méthode permet de rafraichîr l'affichage des différents évènements à afficher
     * @author Emmmanuel
     */
    public void refresh(){
        System.out.println("===");
        ListEvent list = new ReaderEvent().get_data();
        panelV = new JPanel();
        panelV.setLayout(new BoxLayout(panelV, BoxLayout.PAGE_AXIS));
        panelV.setBounds(0, 0, 0, 0);
        panelV.setBorder(LineBorder.createBlackLineBorder());
        if(list.size() == 0){
            panelV.removeAll();
            panelH.removeAll();
            panelH = new JPanel(new FlowLayout());
            JLabel txt = new JLabel("Aucune tâche à afficher");
            txt.setBounds(0, 0, 250, 50);
            txt.setBackground(new Color(200, 0, 0));
            panelH.add(txt);
            panelV.add(panelH);
        }else {
            for (int i = 0; i < list.size(); i++) {
                panelH = new JPanel(new FlowLayout());
                bloc = new BlocEvent(list.getTask(i), i * 10, 150, 150, 150);
                modif = new EButton("Modifier", 0, 0, 100, 100, 255, 255, 255).get();
                supprim = new EButton("Supprimer", 0, 0, 100, 100, 255, 255, 255).get();
                panelH.add(bloc);
                panelH.add(modif);
                panelH.add(supprim);
                int tmp = i;
                modif.addActionListener(evt -> {
                    try {
                        new Modification_evenement(new Parameters(), _w, this, tmp, bloc);
                        new SaveEvent().save(list);
                        refresh();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                supprim.addActionListener(evt -> {
                    System.out.println("SUPPRIMER");
                    list.erase(tmp);
                    try {
                        new SaveEvent().save(list);
                        refresh();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                panelV.add(panelH);
            }
        }
        if (_w.getContentPane().getComponents().length > 2) {
            _w.getContentPane().remove(2);
        }
        _w.add(panelV);
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
