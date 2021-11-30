import Task.TaskManager;
import Window.Window;
import EButton.EButton;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import Task.ListTask;
import EventHandler.*;

public class Manager {
    public static void main(String[] args) throws IOException {
        Window one = new Window("a");

        JButton bt = new EButton("Paramètre", 300, 50, 100, 300, 255, 0, 0).dis;
        one.map.put(bt, 1);
        bt.addActionListener(one);
        one.add(bt);

        JButton but = new EButton("Fermer", 400, 50, 100, 600, 0, 255, 0).dis;
        one.map.put(but, 2);
        but.addActionListener(one);
        one.add(but);

        JButton butt = new EButton("Agrandir", 500, 50, 100, 900, 0, 0, 255).dis;
        one.map.put(butt, 3);
        butt.addActionListener(one);
        one.add(butt);

        JButton buttt = new EButton("", 700, 50, 30, 30, 255, 0, 255).dis;
        one.map.put(buttt, 3);
        buttt.addActionListener(one);
        one.add(buttt);

        TaskManager t = new TaskManager(one);
        t.go();

        JButton z = new EButton("z", 0, 0, 1, 1, 255, 255, 255).dis;
        one.map.put(z, 4);
        z.addActionListener(one);
        one.add(z);

        Scrollbar scroll=new Scrollbar();
		scroll.setOrientation(Scrollbar.VERTICAL);
		scroll.setBounds(one.getContentPane().getWidth()-20,0,20,one.getContentPane().getHeight());
		scroll.setMaximum(400);
		scroll.setMinimum(0);
        scroll.setVisibleAmount(30);
        one.add(scroll,BorderLayout.EAST);
        
        new ReaderEvent().print();
        ListTask list = new ListTask();
        list.add("caa", "Vital", "Dormir => ronpiche", "27/10/2021", "17h", "27/10/2021", "23", "4");
        new SaveEvent().save(list);
    }
}
