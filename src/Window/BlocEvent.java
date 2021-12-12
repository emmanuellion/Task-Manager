package Window;
import Event.Event;

import javax.swing.*;

public class BlocEvent extends JPanel {
    private JLabel TitrEvent, CatEvent, DebEvent, FinEvent, ImpEvent;
    public BlocEvent(Event E) {
        super(new BoxLayout());
        setBorder(LineBorder.createGrayLineBorder());
        TitrEvent = new JLabel(E.getTitre());
        ImpEvent = new JLabel(E.getImp());
        CatEvent = new JLabel("Catégorie : " + E.getCat() + ".");
        DebEvent = new JLabel("Date de début de l'évènement : " + E.getBDate() + "  " + E.getBHour());
        FinEvent = new JLabel("Date de fin de l'évènement : " + E.getBDate() + "  " + E.getBHour());
        this.add(TitrEvent);
        this.add(ImpEvent);
        this.add(CatEvent);
        this.add(DebEvent);
        this.add(FinEvent);
    }
}