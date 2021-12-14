package EButton;

import javax.swing.*;
import java.awt.*;

/**
 * Cette classe est une extension de la classe JButton, permettant d'initialiser la taille, le contenu texte et la couleur
 * du du bouton lors de son instanciation
 * @author Emmanuel
 */
public class EButton extends JButton {
    /**
     * Instance du JButton
     */
    public JButton dis = new JButton();

    /**
     * Cette méthode permet d'instancier un nouveau JButton tout en lui fournissant diverses caractéristiques
     * @author Emmanuel
     * @param value Le paramètre 'value' correspond au texte qui sera présent dans le bouton
     * @param x Le paramètre 'x' correspond à un point sur l'axe horizontal afin de placer le bouton
     * @param y Le paramètre 'y' correspond à une point sur l'axe vertical afin de placer le bouton
     * @param width Le paramètre 'width' correspond à la largeur du bouton
     * @param height Le paramètre 'height' correspond à la hauteur du bouton
     * @param bg_r Le paramètre 'bg_r' correspond à la composante "red" du code rgb définissant la couleur du bouton
     * @param bg_g Le paramètre 'bg_g' correspond à la composante "green" du code rgb définissant la couleur du bouton
     * @param bg_b Le paramètre 'bg_b' correspond à la composante "blue" du code rgb définissant la couleur du bouton
     */
    public EButton(String value, int x, int y, int width, int height, int bg_r, int bg_g, int bg_b){
        dis.setText(value);
        dis.setBounds(x, y, width, height);
        dis.setBackground(new Color(bg_r, bg_g, bg_b));
    }

    /**
     * Cette méthode permet d'obtenir l'instance du JButton créé
     * @author Emmanuel
     * @return Un JButton correspondant à l'instance courante
     */
    public JButton get(){
        return dis;
    }
}
