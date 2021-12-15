package EventHandler;

import java.util.*;
import java.io.*;
import Event.ListEvent;

/**
 * Cette classe permet de lire un fichier contenant les évènements et de les stocker
 * @author Evan et Emmanuel
 */
public class ReaderEvent {

    /**
     * Instanciation du fichier où sont stockés les évènements
     */
    private static final File file = new File("src/file.ev");

    /**
     * Cette méthode permet de lire le fichier instancié afin d'en ressortir une liste d'évènements
     * @author Evan et Emmanuel
     * @return Un objet de la classe 'ListEvent' permettant de stocker une liste d'évènements
     */
    public ListEvent get_data() throws FileNotFoundException {
        try(Scanner scan = new Scanner(file)) {
            ListEvent list = new ListEvent();
            while(scan.hasNextLine()) {
                String str = scan.nextLine();
                if(!Objects.equals(str, "")){
                    Vector <String> tmp = new Vector<>();
                    StringBuilder builder = new StringBuilder();
                    for (String car : str.split("")){
                        if(!Objects.equals(car, "~")){
                            builder.append(car);
                        }else{
                            tmp.add(builder.toString());
                            builder.delete(0, builder.length());
                        }
                    }
                    list.add(tmp.get(0), tmp.get(1), tmp.get(2), tmp.get(3), tmp.get(4), tmp.get(5), tmp.get(6), tmp.get(7));
                }
            }
            return list;
        }
    }

    /**
     * Sortie pour débugger la classe
     * @author Emmanuel
     */
    public void print() throws FileNotFoundException {
        ListEvent list = get_data();
        for(int i = 0; i < list.size(); i++){
            System.out.println("Event => " + list.get(i) + "\n===============");
        }
    }
}
