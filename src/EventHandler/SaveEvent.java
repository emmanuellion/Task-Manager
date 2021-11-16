package EventHandler;

import java.io.*;
import Task.ListTask;

public class SaveEvent {
    private static final File file = new File("src/file.ev");

    public void save(ListTask listTask) throws IOException {
        if((file.exists())) {
            FileWriter write = new FileWriter(file, true);
            for(int i = 0; i < listTask.size(); i++) {
                write.append(listTask.get(i));
                write.append("\n");
            }
            write.close();
        } else {
            System.out.println("Le fichier file.ev a été supprimé ou déplacé, veuillez le restaurer ou le replacer.");
        }
    }
}
