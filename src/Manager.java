import Window.Window;
import EButton.EButton;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Vector;

public class Manager {
    public static void main(String[] args) throws IOException {
        Window one = new Window("a");

        JButton bt = new EButton("a", 300, 200, 100, 300, 255, 0, 0).dis;
        one.map.put(bt, 1);
        bt.addActionListener(one);
        one.add(bt);

        JButton but = new EButton("b", 400, 250, 100, 600, 0, 255, 0).dis;
        one.map.put(but, 2);
        but.addActionListener(one);
        one.add(but);

        JButton butt = new EButton("c", 500, 300, 100, 900, 0, 0, 255).dis;
        one.map.put(butt, 3);
        butt.addActionListener(one);
        one.add(butt);

        new ReaderEvent().print();
        ListTask list = new ListTask();
        list.add("caa", "Vital", "Dormir => ronpiche", "27/10/2021", "17h", "27/10/2021", "23", "4");
        new SaveEvent().save(list);
    }
}
