package Window;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    private static Window main;

    public Window(String s){
        super(s);

        //Dispose toutes les ressources de la fenêtre, si la dernière est disposé l'application s'arrête
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //this.setAlwaysOnTop(true); //Affiche la fenêtre au-dessus de toutes les autres fenêtres
        Dimension dim = new Dimension(); //Déclare un objet Dimension
        dim.height = 400; //Initialise la donnée membre height
        dim.width = 800; //Initialise la donnée membre width
        this.setMinimumSize(dim); //Met la taille minimale à l'objet dim (de type Dimension)
        dim.height = 500;
        dim.width = 1000;
        this.setSize(dim);
        this.setLocationRelativeTo(null); //Positionne la fenêtre au centre de l'écran
        this.setVisible(true); //Affiche la fenêtre
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource() == bt){
            System.out.println("bt 1");
        }else{
            Window newe = new Window("second");
            newe.perform_action();
        }*/
    }

    public static void main(String[] args) {

    }
}
