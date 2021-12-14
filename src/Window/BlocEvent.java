package Window;
import Event.Event;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BlocEvent extends JPanel {
    /**
     * Ensemble des JLabels contenant les informations de l'évènement
     * @author Evan
     */
    private JLabel TitrEvent, CatEvent, DebEvent, FinEvent, ImpEvent, DesEvent;
    /**
     * Créé une instance de BlocEvent
     * @param E Évènement dont on va afficher les informations dans ce bloc
     * @param y Position verticale
     * @param r Indice de la couleur rouge du bloc
     * @param g Indice de la couleur verte du bloc
     * @param b Indice de la couleur bleue du bloc
     * @author Evan
     */
    public BlocEvent(Event E, int y, int r, int g, int b) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(LineBorder.createGrayLineBorder());
        setBounds(50, y, 500, 500);
        setBackground(new Color(r, g, b));
        TitrEvent = new JLabel(E.getTitre());
        ImpEvent = new JLabel(E.getImp());
        CatEvent = new JLabel("Catégorie : " + E.getCat() + ".");
        DesEvent = new JLabel(E.getDesc());
        DebEvent = new JLabel("Date de début de l'évènement : " + E.getBDate() + "  " + E.getBHour());
        FinEvent = new JLabel("Date de fin de l'évènement : " + E.getBDate() + "  " + E.getBHour());
        this.add(TitrEvent);
        this.add(ImpEvent);
        this.add(CatEvent);
        this.add(DesEvent);
        this.add(DebEvent);
        this.add(FinEvent);
    }
    /**
     * Va modifier le JLabel contenant le titre de l'évènement (nécessaire pour la fenêtre Modification_evenement)
     * @param titre Nouveau titre
     * @author Evan
     */
    public void setTitr(String titre) {
        TitrEvent = new JLabel(titre);
    }
    /**
     * Va modifier le JLabel contenant l'importance de l'évènement (nécessaire pour la fenêtre Modification_evenement)
     * @param imp Nouvelle importance
     * @author Evan
     */
    public void setImp(String imp) {
        ImpEvent = new JLabel(imp);
    }
    /**
     * Va modifier le JLabel contenant la catégorie de l'évènement (nécessaire pour la fenêtre Modification_evenement)
     * @param cat Nouvelle catégorie
     * @author Evan
     */
    public void setCat(String cat) {
        CatEvent = new JLabel("Catégorie : " + cat + ".");
    }
    /**
     * Va modifier le JLabel contenant la description de l'évènement (nécessaire pour la fenêtre Modification_evenement)
     * @param descrip Nouvelle description
     * @author Evan
     */
    public void setDes(String descrip) {
        DesEvent = new JLabel(descrip);
    }
    /**
     * Va modifier le JLabel contenant la date et heure de début de l'évènement (nécessaire pour la fenêtre Modification_evenement)
     * @param BDate Nouvelle date de début
     * @param BHour Nouvelle heure de début
     * @author Evan
     */
    public void setDeb(String BDate, String BHour) {
        DebEvent = new JLabel("Date de début de l'évènement : " + BDate + "  " + BHour);
    }
    /**
     * Va modifier le JLabel contenant la date et heure de fin de l'évènement (nécessaire pour la fenêtre Modification_evenement)
     * @param EDate Nouvelle date de début
     * @param EHour Nouvelle heure de début
     * @author Evan
     */
    public void setFin(String EDate, String EHour) {
        FinEvent = new JLabel("Date de fin de l'évènement : " + EDate + "  " + EHour);
    }
}