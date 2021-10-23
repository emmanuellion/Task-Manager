import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private static JButton bt;
    private static JButton but;

    Main(){
        super("first application");

        //Dispose toutes les ressources de la fenêtre, si la dernière est disposé l'application s'arrête
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.setAlwaysOnTop(true); //Affiche la fenêtre au-dessus de toutes les autres fenêtres
        Dimension dim = new Dimension(); //Déclare un objet Dimension
        dim.height = 400; //Initialise la donnée membre height
        dim.width = 800; //Initialise la donnée membre width
        this.setMinimumSize(dim); //Met la taille minimale à l'objet dim (de type Dimension)
        dim.height = 500;
        dim.width = 1000;
        this.setSize(dim);
        this.setLocationRelativeTo(null); //Positionne la fenêtre au centre de l'écran

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt){
            System.out.println("bt 1");
        }else{
            System.out.println("bt 2");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        JPanel panel = (JPanel) main.getContentPane();
        panel.setLayout(new FlowLayout());
        bt = new JButton("clique 1 !"); //Crée un objet JButton
        bt.addActionListener(main);
        panel.add(bt); //Ajoute l'objet bt au Layer
        but = new JButton("clique 2 !");
        but.addActionListener(main);
        panel.add(but);
        panel.add(new JButton("clique 3 !"));
        panel.add(new JButton("clique 4 !"));
        panel.add(new JCheckBox("go"));
        panel.add(new JLabel("mdp : "));
        panel.add(new JTextField(10));
        main.setVisible(true); //Affiche la fenêtre
    }
}
