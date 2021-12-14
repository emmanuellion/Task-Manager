package Window;

import EventHandler.ReaderEvent;

import javax.swing.*;
import java.awt.*;
import Event.ListEvent;
/**
 * Cette classe permet de créer une nouvelle fenêtre avec certaines caractéristiques
 * @author Emmanuel
 */
public class Window extends JFrame{
    ListEvent list  = new ReaderEvent().get_data();

    /**
     * Cette méthode permet d'instancier la fenêtre avec certaines caractéristiques
     * @author Emmanuel
     * @param s Le paramètre 's' correspond à une chaîne de caractères spécifiant le nom de la fenêtre
     */
    public Window(String s){
        super(s);
        this.getContentPane().setBackground(new Color(64,63,61));
        //Dispose toutes les ressources de la fenêtre, si la dernière est disposé l'application s'arrête
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //this.setAlwaysOnTop(true); //Affiche la fenêtre au-dessus de toutes les autres fenêtres
        Dimension dim = new Dimension(); //Déclare un objet Dimension
        dim.height = 780; //Initialise la donnée membre height
        dim.width = 1280; //Initialise la donnée membre width
        this.setMinimumSize(dim); //Met la taille minimale à l'objet dim (de type Dimension)
        this.setSize(dim);
        this.setMaximumSize(dim);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null); //Positionne la fenêtre au centre de l'écran
        this.setVisible(true); //Affiche la fenêtre
    }

    /**
     * Cette méthode permet d'obtenir la liste des évènements chargés
     * @author Emmanuel
     * @return Une list correspondant au évènement chargé lors de la création de la fenêtre principale
     */
    public ListEvent getList(){
        return list;
    }
}
