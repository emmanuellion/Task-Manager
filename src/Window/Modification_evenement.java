package Window;

import Event.EventManager;
import Event.ListEvent;
import Event.Parameters.Parameters;
import EventHandler.ReaderEvent;
import EventHandler.SaveEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class Modification_evenement extends javax.swing.JFrame {

    /**
     * Creates new form Modification_evenement
     */
    public Modification_evenement(Parameters p, EventManager _ev, int _index, BlocEvent _be) throws FileNotFoundException {
        param = p;
        ev = _ev;
        index = _index;
        be = _be;
        _liste = new ReaderEvent().get_data();
        initComponents();
        defTitre();
        defBDate();
        defBHour();
        defDesc();
        defEDate();
        defEHour();
        getContentPane().setBackground(new java.awt.Color(64,63,61));
        definitionCat(param);
        definitionImp(param);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * Initialise les composants de la JFrame
     */
    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        JButton jButton3 = new JButton();
        JLabel jLabel1 = new JLabel();
        JButton jButton1 = new JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JButton jButton2 = new JButton();
        jTextField2 = new javax.swing.JTextField();
        JLabel jLabel10 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creation_evenement");
        setBackground(new java.awt.Color(64, 63, 61));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jFormattedTextField1.setColumns(10);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/y"))));

        jFormattedTextField2.setColumns(10);
        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jButton3.setText("Annuler");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Arial", Font.PLAIN, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(this);
        jLabel1.setText("Modification d'un évènement");

        jButton1.setText("Valider");
        jButton1.addActionListener(evt -> {
            try {
                jButton1ActionPerformed();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jFormattedTextField3.setColumns(4);
        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField3.addActionListener(this::jFormattedTextField3ActionPerformed);

        jFormattedTextField4.setColumns(4);
        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField4.addActionListener(this::jFormattedTextField4ActionPerformed);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Titre :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Catégorie :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Importance :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date de début :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date de fin :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Heure de début :");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Heure de fin :");

        jButton2.setText("Ajouter");
        jButton2.addActionListener(evt -> {
            try {
                jButton2ActionPerformed();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ajout d'une catégorie :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextField3)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextField2)
                                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(95, 95, 95)
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ajoute dans l'élément jComboBox1 la liste des catégories des évènements et met le curseur sur la catégorie de l'évènement
     * @param p Paramètre de type Parameters contenant les catégories et importances
     * @author Evan
     */
    private void definitionCat(Parameters p) {
        jComboBox1.removeAllItems();
        for(int i = 0; i<p.getCat().size(); i++) {
            jComboBox1.addItem(p.getFromCat(i));
        }
        jComboBox1.setSelectedItem(_liste.getTask(index).getCat());
    }
    /**
     * Ajoute dans l'élément jComboBox1 la liste des importances des évènements et met le curseur sur l'importance de l'évènement
     * @param p Paramètre de type Parameters contenant les catégories et importances
     * @author Evan
     */
    private void definitionImp(Parameters p) {
        jComboBox2.removeAllItems();
        for(int i = 0; i<p.getImp().size(); i++) {
            jComboBox2.addItem(p.getFromImp(i));
        }
        jComboBox2.setSelectedItem(_liste.getTask(index).getImp());
    }
    /**
     * Met le titre de l'évènement dans jTextField1
     * @author Evan
     */
    private void defTitre() {
        jTextField1.setText(_liste.getTask(index).getTitre());
    }
    /**
     * Met la description de l'évènement dans jTextArea1
     * @author Evan
     */
    private void defDesc() {
        jTextArea1.setText(_liste.getTask(index).getDesc());
    }
    /**
     * Met la date de début de l'évènement dans jFormattedTextField1
     * @author Evan
     */
    private void defBDate() {
        jFormattedTextField1.setText(_liste.getTask(index).getBDate());
    }
    /**
     * Met l'heure de début de l'évènement dans jFormattedTextField1
     * @author Evan
     */
    private void defBHour() {
        jFormattedTextField3.setText(_liste.getTask(index).getBHour());
    }
    /**
     * Met la date de fin de l'évènement dans jFormattedTextField1
     * @author Evan
     */
    private void defEDate() {
        jFormattedTextField2.setText(_liste.getTask(index).getEDate());
    }
    /**
     * Met l'heure de fin de l'évènement dans jFormattedTextField1
     * @author Evan
     */
    private void defEHour() {
        jFormattedTextField4.setText(_liste.getTask(index).getEHour());
    }
    /**
     * Ferme la fenêtre quand le bouton "Annuler" est cliqué
     * @param evt Évènement invoqué quand jButton3 cliqué
     * @author Evan
     */
    private void jButton3ActionPerformed(ActionEvent evt) {
        jTextField1.setText(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextArea1.setText(null);
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        jFormattedTextField3.setText("");
        jFormattedTextField4.setText("");
        setVisible(false); //you can't see me!
        dispose();
    }
    /**
     * Modifie l'évènement associé à cette fenêtre, ainsi que l'affichage de celui-ci. La liste sera ensuite sauvegardée et rechargée
     * @throws IOException Déclénché lors de la sauvegarde des évènements
     * @author Evan
     */
    private void jButton1ActionPerformed() throws IOException {
        _liste.getTask(index).setTitre(jTextField1.getText());
        _liste.getTask(index).setCat(Objects.requireNonNull(jComboBox1.getSelectedItem()).toString());
        _liste.getTask(index).setImp(Objects.requireNonNull(jComboBox2.getSelectedItem()).toString());
        _liste.getTask(index).setDesc(jTextArea1.getText());
        _liste.getTask(index).setBDate(jFormattedTextField1.getText());
        _liste.getTask(index).setBHour(jFormattedTextField3.getText());
        _liste.getTask(index).setEDate(jFormattedTextField2.getText());
        _liste.getTask(index).setEHour(jFormattedTextField4.getText());
        be.setTitre(jTextField1.getText());
        be.setCat(Objects.requireNonNull(jComboBox1.getSelectedItem()).toString());
        be.setImp(Objects.requireNonNull(jComboBox2.getSelectedItem()).toString());
        be.setDes(jTextArea1.getText());
        be.setDeb(jFormattedTextField1.getText(), jFormattedTextField3.getText());
        be.setFin(jFormattedTextField2.getText(), jFormattedTextField4.getText());
        new SaveEvent().save(_liste);
        JPanel tmp = ev.getPanel();
        tmp.removeAll();
        ev.setPanel(tmp);
        ev.refresh();
        setVisible(false); //you can't see me!
        dispose();
    }
    /**
     * Ajoute une catégorie dans l'instance de Parameters, afin que cette catégorie soit sélectionnable à l'avenir pour les autres évènements
     * @throws IOException Déclenché lors de la sauvegarde des catégories
     * @author Evan
     */
    private void jButton2ActionPerformed() throws IOException {
        param.getCat().add(jTextField2.getText());
        param.save(param.getCat());
        definitionCat(param);
    }

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {}

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    /**
     * EventManager à refresh après la modification d'un évènement
     */
    private final EventManager ev;

    /**
     * Liste des catégories et importance permettant de remplir les deux JComboBox et pouvant acceuillir une nouvelle catégorie définie par l'utilsateur 
     */
    private final Parameters param;

    /**
     * Liste des évènements de laquelle on va modifier un évènement précis
     */
    private final ListEvent _liste;

    /**
     * Position dans _liste de notre évènement à modifier
     */
    private final int index;

    /**
     * Panel affichant notre évènement, qu'on va modifier aussi
     */
    private final BlocEvent be;

    /**
     * Liste des catégories
     */
    private javax.swing.JComboBox<String> jComboBox1;

    /**
     * Liste des importances
     */
    private javax.swing.JComboBox<String> jComboBox2;

    /**
     * Boite dans laquelle on va saisir la date de début (formaté pour correspondre au format de la date jj/mm/aaaa)
     */
    private javax.swing.JFormattedTextField jFormattedTextField1;

    /**
     * Boite dans laquelle on va saisir la date de fin (formaté pour correspondre au format de la date jj/mm/aaaa)
     */
    private javax.swing.JFormattedTextField jFormattedTextField2;

    /**
     * Boite dans laquelle on va saisir l'heure de début (formaté pour correspondre au format de l'heure hh:mm)
     */
    private javax.swing.JFormattedTextField jFormattedTextField3;

    /**
     * Boite dans laquelle on va saisir l'heure de fin (formaté pour correspondre au format de l'heure hh:mm)
     */
    private javax.swing.JFormattedTextField jFormattedTextField4;

    /**
     * Champ dans laquelle on écrit la description de l'évènement
     */
    private javax.swing.JTextArea jTextArea1;

    /**
     * Champ dans lequel on saisit le titre de l'évènement
     */
    private javax.swing.JTextField jTextField1;

    /**
     * Champ dans lequel on saisit la nouvelle catégorie à ajouter
     */
    private javax.swing.JTextField jTextField2;
}
