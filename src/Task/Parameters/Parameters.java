package Task.Parameters;

import java.util.Objects;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Cette classe permet de charger toutes les catégories prisent en charge par le logiciel
 * @author Emmanuel
 */
public class Parameters {
    /**
     * Instanciation du vecteur visé à contenir toutes les catégories
     */
    private static final Vector<String> listCategory = new Vector<>();

    /**
     * Cette méthode permet de stocker les catégories prisent en charge lors de l'instanciation de la classe
     * @author Emmanuel
     * @throws FileNotFoundException
     */
    Parameters() throws FileNotFoundException {
        try (Scanner scan = new Scanner(new File("src/config.ev"))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (!Objects.equals(line, "")) {
                    StringBuilder builder = new StringBuilder();
                    for (String car : line.split("")) {
                        if (!Objects.equals(car, "~")) {
                            builder.append(car);
                        } else {
                            listCategory.add(builder.toString());
                        }
                    }
                }
            }
        }
    }

    /**
     * Cette méthode permet d'obtenir le vecteur comprenant les catégories
     * @author Emmanuel
     * @return Un vecteur comprenant toutes les catégories prisent en charge
     */
    public Vector<String> getCat() {return listCategory;}

    /**
     * Cette méthode permet de récupérer une catégorie à la ième place dans la liste des catégories
     * @author Emmanuel
     * @param index Le paramètre 'index' correspond à l'index de la catégorie que l'on veut récupérer
     * @return Une chaîne de caractère correspondant à la catégorie 
     */
    public String get(int index){return listCategory.get(index);}
}