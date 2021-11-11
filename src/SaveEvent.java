import java.io.*;
import java.util.*;

public class SaveEvent {
    private static final File file = new File("src/file.ev");
    private static File f;
    private static BufferedWriter FW;
    private static BufferedReader FR;

    public void save(ListTask listTask) throws IOException {
        /*for(String[] element : listTask){
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
        }*/
        try {
            f = new File("file.ev");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        if((f.exists())) {
            try {
                FW = new BufferedWriter(new FileWriter(f));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            for(int i = 0; i < listTask.taille(); i++) {
                try {
                    FW.write(listTask.get(i));
                    FW.newLine();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            try {
                FW.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Le fichier file.ev a été supprimé ou déplacé, veuillez le restaurer ou le replacer.");
        }
    }
}
