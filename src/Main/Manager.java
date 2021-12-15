package Main;

import EButton.EButton;
import Event.EventManager;
import Event.Parameters.Parameters;
import Window.Ajout_evenement;
import Window.Window;

import javax.swing.*;
import java.io.FileNotFoundException;

/**
 * Cette classe permet de créer l'application avec l'affichage de la fenêtre d'accueil, le chargement des tâches, ...
 * @author Emmanuel
 */
public class Manager {

    /**
     * Cette méthode se lance automatiquement permettant de lancer le script principal du programme
     * @author Emmanuel
     */
    public static void main(String[] args) throws FileNotFoundException {
        Window one = new Window("Event Manager");
        EButton openPopUpAddEvent = new EButton("Ajouter un évènement", 540, 240, 200,100,255,255,255);
        JButton but = openPopUpAddEvent.get();
        one.add(but);
        EventManager tm = new EventManager(one);
        tm.refresh();
        but.addActionListener(evt -> {
            try {
                new Ajout_evenement(new Parameters(), tm);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
