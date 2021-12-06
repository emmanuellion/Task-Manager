package EventHandler;

import java.io.*;
import Event.ListEvent;

/**
 * Cette classe permet de sauvegarder une liste d'évènements dans un fichier
 * @author Evan et Emmanuel
 */
public class SaveEvent {
    /**
     * Instanciation du fichier où sont stockés les évènements
     */
    private static final File file = new File("src/file.ev");

    /**
     * Cette méthode permet de sauvegarder dans un fichier instancié une liste d'évènements renseignée en paramètre de la fonction
     * lors de son appel
     * @author Evan et Emmanuel
     * @param listEvent Le paramètre 'listEvent' correspond à la liste d'évènements à sauvegarder dans le fichier
     * @throws IOException Déclenché si le fichier n'existe pas dans ce répertoire
     */
    public void save(ListEvent listEvent) throws IOException {
        if((file.exists())) {
            FileWriter write = new FileWriter(file, true);
            for(int i = 0; i < listEvent.size(); i++) {
                write.append(listEvent.get(i));
                write.append("\n");
            }
            write.close();
        } else {
            System.out.println("Le fichier file.ev a été supprimé ou déplacé, veuillez le restaurer ou le replacer.");
        }
    }
}
