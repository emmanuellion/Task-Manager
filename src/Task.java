public class Task {
    private String title, category, description, b_date, b_hour, e_date, e_hour, importance;

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
        return (title + "~" + category + "~" + description + "~" + b_date + "~" + b_hour + "~" + e_date + "~" + e_hour + "~" + importance);
    }
}
