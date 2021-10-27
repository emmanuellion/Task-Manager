import Window.*;
import Window.Window;

import javax.swing.*;
import java.awt.*;

public class Manager {
    public static void main(String[] args) {
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
        ReaderJSON a = new ReaderJSON("src/file.json");
    }
}
