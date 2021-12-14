package Window;

import javax.swing.*;
import java.awt.*;

/**
 * Cette classe permet de créer une nouvelle fenêtre avec certaines caractéristiques
 * @author Emmanuel
 */
public class Window extends JFrame{

    /**
     * Cette méthode permet d'instancier la fenêtre avec certaines caractéristiques
     * @author Emmanuel
     * @param s Le paramètre 's' correspond à une chaîne de caractères spécifiant le nom de la fenêtre
     */
    public Window(String s){
        super(s);
        this.getContentPane().setBackground(new Color(64,63,61));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension dim = new Dimension();
        dim.height = 780;
        dim.width = 1280;
        this.setMinimumSize(dim);
        this.setSize(dim);
        this.setMaximumSize(dim);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
