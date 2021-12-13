package Main;

import EButton.EButton;
import Event.EventManager;
import Event.Parameters.Parameters;
import Window.Ajout_evenement;
import Window.Window;

import java.io.FileNotFoundException;

/**
 * Cette classe permet de créer l'application avec l'affichage de la fenêtre d'accueil, le chargement des tâches, ...
 * @author Emmanuel
 */
public class Manager {
    private static Window one;
    /**
     * Cette méthode se lance automatiquement permettant de lancer le script principal du programme
     * @author Emmanuel
     */
    public static void main(String[] args) {
        one = new Window("a");
        /*Scrollbar scroll=new Scrollbar();
		scroll.setOrientation(Scrollbar.VERTICAL);
		scroll.setBounds(one.getContentPane().getWidth()-20,0,20,one.getContentPane().getHeight());
		scroll.setMaximum(400);
		scroll.setMinimum(0);
        scroll.setVisibleAmount(30);
        one.add(scroll);*/
        EButton openPopUpAddEvent = new EButton("Ajouter un évènement", 100, 200, 200,100,255,0,0);
        one.add(openPopUpAddEvent);
        EventManager tm = new EventManager(one);
        tm.refresh();
        openPopUpAddEvent.addActionListener(evt -> {
            try {
                new Ajout_evenement(new Parameters(), one, tm);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
