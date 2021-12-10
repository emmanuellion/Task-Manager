package Event.Parameters;

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
     * Instanciation du vecteur visé à contenir toutes les importances plausibles
     */
    private static final Vector<String> listImportance = new Vector<>();

    /**
     * Cette méthode permet de stocker les catégories prisent en charge lors de l'instanciation de la classe
     * @author Emmanuel
     * @throws FileNotFoundException Déclenché si le fichier n'est pas trouvé dans le chemin indiqué
     */
    public Parameters() throws FileNotFoundException {
        try (Scanner scan = new Scanner(new File("src/config.ev"))) {
            int nb_line = 0;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (!Objects.equals(line, "")) {
                    StringBuilder builder = new StringBuilder();
                    for (String car : line.split("")) {
                        if (!Objects.equals(car, "~")) {
                            builder.append(car);
                        } else {
                            if(nb_line == 0)
                                listCategory.add(builder.toString());
                            else if(nb_line == 1)
                                listImportance.add(builder.toString());
                        }
                    }
                }
                nb_line++;
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
     * Cette méthode permet d'obtenir le vecteur comprenant les importances plausibles
     * @author Emmanuel
     * @return Un vecteur comprenant toutes les importances plausibles
     */
    public Vector<String> getImp() {return listImportance;}

    /**
     * Cette méthode permet de récupérer une catégorie à la i<i>ème</i> place dans la liste des catégories
     * @author Emmanuel
     * @param index Le paramètre 'index' correspond à l'index de la catégorie que l'on veut récupérer
     * @return Une chaîne de caractère correspondant à la catégorie
     */
    public String getFromCat(int index){return listCategory.get(index);}

    /**
     * Cette méthode permet de récupérer une importance à la i<i>ème</i> place dans la liste des importances
     * @author Emmanuel
     * @param index Le paramètre 'index' correspond à l'index de l'importance que l'on veut récupérer
     * @return Une chaîne de caractère correspondant à l'importance
     */
    public String getFromImp(int index){return listImportance.get(index);}
}