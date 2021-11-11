package EButton;

import javax.swing.*;
import java.awt.*;

public class EButton extends JButton {
    public JButton dis = new JButton();

    public EButton(String value, int x, int y, int width, int height, int bg_r, int bg_g, int bg_b){
        dis.setText(value);
        dis.setBounds(x, y, width, height);
        dis.setBackground(new Color(bg_r, bg_g, bg_b));
    }
}
