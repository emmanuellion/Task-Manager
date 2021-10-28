import Window.Window;
import javax.swing.*;
import java.io.IOException;
import java.util.*;

public class Manager {
    public static void main(String[] args) throws IOException {
        Window one = new Window("a");

        JButton bt = new JButton("a");
        bt.setBounds(300, 200, 100, 100);
        one.map.put(bt, 1);
        one.all_element.add(bt);
        bt.addActionListener(one);
        one.add(bt);

        JButton but = new JButton("b");
        one.map.put(but, 2);
        but.addActionListener(one);
        one.add(but);

        JButton butt = new JButton("c");
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
