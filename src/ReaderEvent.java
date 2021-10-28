import java.util.*;
import java.io.*;

public class ReaderEvent {
    private static final File file = new File("src/file.ev");

    public Map<String, String[]> get_data(){
        try(Scanner scan = new Scanner(file)) {
            Map <String, String[]> map_event = new HashMap<>();
            while(scan.hasNextLine()) {
                Vector <String> tmp = new Vector<>();
                StringBuilder tmp_info = new StringBuilder();
                String str = scan.nextLine();
                for (String car : str.split("")){
                    if(!Objects.equals(car, "~")){
                        tmp_info.append(car);
                    }else{
                        tmp.add(tmp_info.toString());
                        tmp_info = new StringBuilder();
                    }
                }
                boolean title_passed = false;
                String title = "";
                String[] element = new String[5];
                int i = 0;
                for(String info : tmp){
                    if(!title_passed){
                        title = info;
                        title_passed = true;
                    }else{
                        element[i] = info;
                        i++;
                    }
                }
                map_event.put(title, element);
            }
            return map_event;
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return null;
        }
    }

    public void print(){
        Map<String, String[]> tmp = get_data();
        for(String event : tmp.keySet()){
            System.out.println("Event => " + event + " has info :\n" + Arrays.toString(tmp.get(event)) + "\n===============");
        }
    }
}
