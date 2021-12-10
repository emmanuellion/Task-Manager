package Main;

import Event.EventManager;
import Event.Parameters.Parameters;
import Window.Ajout_evenement;
import Window.Window;
import EButton.EButton;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

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
    public static void main(String[] args) throws IOException{
        one = new Window("a");
        Scrollbar scroll=new Scrollbar();
		scroll.setOrientation(Scrollbar.VERTICAL);
		scroll.setBounds(one.getContentPane().getWidth()-20,0,20,one.getContentPane().getHeight());
		scroll.setMaximum(400);
		scroll.setMinimum(0);
        scroll.setVisibleAmount(30);
        one.add(scroll);
        EButton openPopUpAddEvent = new EButton("Ajouter un évènement", 100, 200, 200,100,255,0,0);
        one.add(openPopUpAddEvent);
        EventManager tm = new EventManager(one);
        tm.go();
        openPopUpAddEvent.addActionListener(evt -> {
            try {
                new Ajout_evenement(new Parameters(), one, tm);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
