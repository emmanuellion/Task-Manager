import Task.TaskManager;
import Window.Window;
import EButton.EButton;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import Task.ListTask;
import EventHandler.*;

/**
 * Cette classe permet de créer d'initialiser l'application avec la première fenêtre, chargement des tâches, ...
 * @author Evan
 */
public class Manager {
    /**
     * Cette méthode se lance automatiquement
     * @author Evan
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Window one = new Window("a");
        Scrollbar scroll=new Scrollbar();
		scroll.setOrientation(Scrollbar.VERTICAL);
		scroll.setBounds(one.getContentPane().getWidth()-20,0,20,one.getContentPane().getHeight());
		scroll.setMaximum(400);
		scroll.setMinimum(0);
        scroll.setVisibleAmount(30);
        one.add(scroll,BorderLayout.EAST);
        
        new ReaderEvent().print();
        ListTask list = new ListTask();
        list.add("caa", "Vital", "Dormir => ronpiche", "27/10/2021", "17h", "27/10/2021", "23", "4");
        new SaveEvent().save(list);
        TaskManager tm = new TaskManager(one);
        tm.go();

    }
}
