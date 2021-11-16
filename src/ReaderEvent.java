import java.util.*;
import java.io.*;

public class ReaderEvent {
    private static final File file = new File("src/file.ev");

    public ListTask get_data(){
        try(Scanner scan = new Scanner(file)) {
            ListTask list = new ListTask();
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
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return null;
        }
    }

    public void print(){
        ListTask list = get_data();
        for(int i = 0; i < list.size(); i++){
            System.out.println("Event => " + list.get(i) + "\n===============");
        }
    }
}
