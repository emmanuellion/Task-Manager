package Task;

public class Task {
    private final String title;
    private final String category;
    private final String description;
    private final String b_date;
    private final String b_hour;
    private final String e_date;
    private final String e_hour;
    private final String importance;

    Task(String title, String category, String description, String b_date, String b_hour, String e_date, String e_hour, String importance) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.b_hour = b_hour;
        this.b_date = b_date;
        this.e_hour = e_hour;
        this.e_date = e_date;
        this.importance = importance;
    }
    //
    public String getInfos() {
        return (title + "~" + category + "~" + description + "~" + b_date + "~" + b_hour + "~" + e_date + "~" + e_hour + "~" + importance + "~");
    }
}
