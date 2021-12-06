package EButton;

import javax.swing.*;
import java.awt.*;

/**
 * Cette classe est une extension de la classe JButton, permettant d'initialiser la taille, le contenu texte et la couleur
 * du composant lors de son instanciation
 * @author Emmanuel
 */
public class EButton extends JButton {
    /**
     * Instance du JButton
     */
    public JButton dis = new JButton();

    /**
     * Cette méthode permet d'instancier un nouveau JButton tout en lui fournissant divers caractéristiques
     * @param value Le paramètre 'value' correspond au texte qui sera présent dans le bouton
     * @param x Le paramètre 'x' correspond à une coordonnée sur l'axe horizontal afin de placer le bouton
     * @param y Le paramètre 'y' correspond à une coordonnée sur l'axe vertical afin de placer le bouton
     * @param width Le paramètre 'width' correspond à la largeur du bouton
     * @param height Le paramètre 'height' correspond à la hauteur du bouton
     * @param bg_r Le paramètre 'bg_r' correspond à la composante "red" du cde rgb définissant la couleur du bouton
     * @param bg_g Le paramètre 'bg_g' correspond à la composante "green" du cde rgb définissant la couleur du bouton
     * @param bg_b Le paramètre 'bg_b' correspond à la composante "blue" du cde rgb définissant la couleur du bouton
     */
    public EButton(String value, int x, int y, int width, int height, int bg_r, int bg_g, int bg_b){
        dis.setText(value);
        dis.setBounds(x, y, width, height);
        dis.setBackground(new Color(bg_r, bg_g, bg_b));
    }
}
