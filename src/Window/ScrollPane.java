package Window;

import javax.swing.*;

public class ListeBlocs {
    private int taille;
    private JScrollPane scroll;
    private JPanel panel;
    private BlocEvent bloc;

    public ListeBlocs(Window w) {
        panel = new JPanel(new BoxLayout());
        panel.setBorder(LineBorder.createBlackLineBorder());
        taille = w.getList.size;
        for(int i=0; i<taille; i++) {
            bloc = new BlocEvent();
            panel.add(bloc);
        }
        scroll = new JScrollPane(panel,   ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    }
}