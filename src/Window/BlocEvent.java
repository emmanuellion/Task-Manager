package Window;
import Event.Event;

import javax.swing.*;

public class BlocEvent extends JPanel {
    private JLabel NomEvent;
    public BlocEvent(Event E) {
        super();
        NomEvent = new JLabel(E.getTitre());
        this.add(NomEvent);
    }
}