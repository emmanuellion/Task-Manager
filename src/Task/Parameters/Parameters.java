package Task.Parameters;

import java.util.Objects;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parameters {
    private static final Vector<String> listCategory = new Vector<>();

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

    public Vector<String> getCat() {return listCategory;}

}