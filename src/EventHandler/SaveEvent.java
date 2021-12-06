package EventHandler;

import java.io.*;
import Task.ListTask;

/**
 * Cette classe permet de sauvegarder une liste de tâches dans un fichier
 * @author Evan & Emmanuel
 */
public class SaveEvent {
    /**
     * Instaciation du fichier où sont stockés les évènements
     */
    private static final File file = new File("src/file.ev");

    /**
     * Cette méthode permet de sauvegarder dans un fichier instancié une liste de tâches renseignée en paramètre de la fonction
     * lors de son appel
     * @author Evan & Emmanuel
     * @param listTask Le paramètre 'listTask' sera la liste de tâches à sauvegarder dans le fichier
     * @throws IOException
     */
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
