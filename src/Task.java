import java.util.*;
import java.util.regex.*;
import java.lang.*;

public class Task {
    private String category, importance, date, hour, name_task;
    private String task_infos;

    Task(String category, String importance, String date, String hour, String name_task) {
        this.category = category;
        this.importance = importance;
        this.hour = hour;
        this.date = date;
        this.name_task = name_task;
    }
    //
    public String getInfos() {
        return task_infos = category + "|" + importance + "|" + date + "|" + hour + "|" + name_task;
    }
}
