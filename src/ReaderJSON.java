import java.util.*;
import java.io.*;

public class ReaderJSON {
    private static File file;
    ReaderJSON(String _file){
        file = new File(_file);
        read();
    }

    private static void read(){
        Map <String, Integer> map_count = new HashMap<>();
        map_count.put("brack_op", 0);
        map_count.put("brack_cl", 0);
        map_count.put("quote", 0);
        try(Scanner scan = new Scanner(file)) {
            while(scan.hasNextLine()) {
                for(String e : scan.nextLine().split("")){
                    switch (e) {
                        case "{" -> map_count.put("brack_op", map_count.get("brack_op")+1);
                        case "}" -> map_count.put("brack_cl", map_count.get("brack_cl")+1);
                        case "\"" -> map_count.put("quote", map_count.get("quote")+1);
                        default -> {
                        }
                    }
                }
            }
            for(String key : map_count.keySet()){
                System.out.println(key + " : " + map_count.get(key));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
