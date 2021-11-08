import Window.Window;
import EButton.EButton;
import javax.swing.*;
import java.io.IOException;

public class Manager {
    public static void main(String[] args) throws IOException {
        Window one = new Window("a");

        EButton bt = new EButton("a", 300, 200, 100, 100, 255, 0, 0);
        one.map.put(bt, 1);
        bt.addActionListener(one);
        one.add(bt);

        EButton but = new EButton("b", 400, 250, 100, 100, 255, 0, 0);
        one.map.put(but, 2);
        but.addActionListener(one);
        one.add(but);

        EButton butt = new EButton("c", 500, 300, 100, 100, 255, 0, 0);
        one.map.put(butt, 3);
        butt.addActionListener(one);
        one.add(butt);
        new ReaderEvent().print();
        String[] c = new String[6];
        c[0] = "caa";
        c[1] = "Vital";
        c[2] = "Dormir => ronpiche";
        c[3] = "27/10/2021";
        c[4] = "27/10/2021";
        c[5] = "4";
        new SaveEvent().save(c);
    }
}
