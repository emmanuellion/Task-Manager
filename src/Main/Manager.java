package Main;

import Event.EventManager;
import Window.Window;
import Window.Ajout_evenement;

import java.awt.*;
import java.io.IOException;
import Event.ListEvent;
import EventHandler.*;
import Event.Parameters.Parameters;

/**
 * Cette classe permet de créer l'application avec l'affichage de la fenêtre d'accueil, le chargement des tâches, ...
 * @author Emmanuel
 */
public class Manager {
    private static Window one;
    /**
     * Cette méthode se lance automatiquement
     * @author Emmanuel
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        one = new Window("a");
        Scrollbar scroll=new Scrollbar();
		scroll.setOrientation(Scrollbar.VERTICAL);
		scroll.setBounds(one.getContentPane().getWidth()-20,0,20,one.getContentPane().getHeight());
		scroll.setMaximum(400);
		scroll.setMinimum(0);
        scroll.setVisibleAmount(30);
        one.add(scroll,BorderLayout.EAST);
        
        new ReaderEvent().print();
        ListEvent list = new ListEvent();
        list.add("caa", "Vital", "Dormir => ronpiche", "27/10/2021", "17h", "27/10/2021", "23", "4");
        new SaveEvent().save(list);
        EventManager tm = new EventManager(one);
        tm.start();
        new Ajout_evenement(new Parameters(), one);
    }
}
