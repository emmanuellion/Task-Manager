package Window;
import Event.Event;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BlocEvent extends JPanel {
    private JLabel TitrEvent, CatEvent, DebEvent, FinEvent, ImpEvent, DesEvent;
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
    public void setTitr(String titre) {
        TitrEvent = new JLabel(titre);
    }
    public void setImp(String imp) {
        ImpEvent = new JLabel(imp);
    }
    public void setCat(String cat) {
        CatEvent = new JLabel("Catégorie : " + cat + ".");
    }
    public void setDes(String descrip) {
        DesEvent = new JLabel(descrip);
    }
    public void setDeb(String BDate, String BHour) {
        DebEvent = new JLabel("Date de début de l'évènement : " + BDate + "  " + BHour);
    }
    public void setFin(String EDate, String EHour) {
        FinEvent = new JLabel("Date de fin de l'évènement : " + EDate + "  " + EHour);
    }
}