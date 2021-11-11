import java.io.*;
import java.util.*;

public class SaveEvent {
    private static final File file = new File("src/file.ev");

    public void save(Vector<String []> listTask) throws IOException {
        for(String[] element : listTask){
            Map<String, String[]> dic = new ReaderEvent().get_data();
            if(!dic.containsKey(element[0])){
                FileWriter write = new FileWriter(file, true);
                StringBuilder event = new StringBuilder();
                write.append("\n");
                for(String el : element){
                    event.append(el).append('~');
                }
                write.append(event);
                write.close();
                System.out.println("Data saved !");
            }else{
                System.out.println("Evènement déjà existant !");
            }
        }
    }
}
