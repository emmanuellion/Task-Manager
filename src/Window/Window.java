package Window;
import EButton.EButton;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ComponentListener, ActionListener {
    public Vector all_element = new Vector();
    public Map<EButton, Integer> map = new HashMap<>();
    private int width;
    private int height;

    public Window(String s){
        super(s);

        //Dispose toutes les ressources de la fenêtre, si la dernière est disposé l'application s'arrête
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //this.setAlwaysOnTop(true); //Affiche la fenêtre au-dessus de toutes les autres fenêtres
        Dimension dim = new Dimension(); //Déclare un objet Dimension
        dim.height = 780; //Initialise la donnée membre height
        dim.width = 1280; //Initialise la donnée membre width
        this.setMinimumSize(dim); //Met la taille minimale à l'objet dim (de type Dimension)
        this.setSize(dim);
        this.setLocationRelativeTo(null); //Positionne la fenêtre au centre de l'écran
        this.setVisible(true); //Affiche la fenêtre
        this.setLayout(null);
        addComponentListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Map.Entry<EButton, Integer> bt : map.entrySet()){
            if(bt.getKey() == e.getSource()){
                switch (bt.getValue()) {
                    case 1 -> System.out.println("a");
                    case 2 -> System.out.println("b");
                    default -> System.out.println("c");
                }
            }
        }
    }

    public static void main(String[] args) {}

    @Override
    public void componentResized(ComponentEvent e) {
        /*Rectangle base = this.getBounds();
        int _tmp_win_width = (int) base.getWidth();
        int _tmp_win_height = (int) base.getHeight();
        for(JComponent el : all_element){
            int temp_w = Math.round(width/_tmp_win_width);
            int temp_h = Math.round(height/_tmp_win_height);
            if(temp_w < 1)
                temp_w = 1 + (1 - temp_w);
            else
                temp_w = 1 - (temp_w - 1);
            if(temp_h < 1)
                temp_h = 1 + (1 - temp_h);
            else
                temp_h = 1 - (temp_h - 1);
            System.out.println("temp_h : " + temp_h + "\ntemp_w : " + temp_w);
            Rectangle tmp = el.getBounds();
            el.setSize((int) tmp.getWidth() * temp_w, (int) tmp.getHeight() * temp_h);
            System.out.println("===========\nWidth : " + el.getWidth() + "\nHeight : " + el.getHeight());
        }
        width = _tmp_win_width;
        height = _tmp_win_height;*/
    }

    @Override
    public void componentMoved(ComponentEvent e) {}

    @Override
    public void componentShown(ComponentEvent e) {}

    @Override
    public void componentHidden(ComponentEvent e) {}
}
