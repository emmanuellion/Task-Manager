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

    /**
     * Instanciation du JPanel correspondant à la pile d'évènements à afficher
     */
    private JPanel panelV = new JPanel();

    /**
     * Instanciation du JPanel alignant l'évènement, le bouton pour supprimer et celui pour modifier l'évènement
     */
    private JPanel panelH = new JPanel();

    /**
     * Instanciation de l'objet 'BlocEvent' affichant la tâche et ses caractéristiques
     */
    private BlocEvent bloc;

    /**
     * Instanciation de la fenêtre affichant les évènements
     */
    private final Window _w;

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
                JButton modif = new EButton("Modifier", 0, 0, 100, 100, 255, 255, 255).get();
                JButton supprim = new EButton("Supprimer", 0, 0, 100, 100, 255, 255, 255).get();
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
