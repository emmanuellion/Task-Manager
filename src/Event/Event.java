package Event;

/**
 * Cette classe permet d'instancier un objet 'Event' correspondant à une tâche créé
 * @author Evan
 */
public class Event {
    /**
     * Le paramètre 'title' correspond à une chaîne de caractères représentant le titre de l'évènement
     */
    private String title;
    /**
     * Le paramètre 'category' correspond à une chaîne de caractères représentant la catégorie de l'évènement
     */
    private String category;
    /**
     * Le paramètre 'description' correspond à une chaîne de caractères représentant la description de l'évènement
     */
    private String description;
    /**
     * Le paramètre 'b_date' correspond à une chaîne de caractères représentant le jour de début de l'évènement
     */
    private String b_date;
    /**
     * Le paramètre 'b_hour' correspond à une chaîne de caractères représentant l'heure de début de l'évènement
     */
    private String b_hour;
    /**
     * Le paramètre 'e_date' correspond à une chaîne de caractères représentant le jour de fin de l'évènement
     */
    private String e_date;
    /**
     * Le paramètre 'e_hour' correspond à une chaîne de caractères représentant l'heure de fin de l'évènement
     */
    private String e_hour;
    /**
     * Le paramètre 'importance' correspond à une chaîne de caractères représentant l'importance de l'évènement
     */
    private String importance;

    /**
     * Cette méthode permet d'instancier une nouvelle tâche avec les paramètres renseignés
     * @author Evan
     * @param title Le paramètre 'title' correspond au titre de l'évènement à instancier
     * @param category Le paramètre 'category' correspond à la catégorie de l'évènement à instancier
     * @param description Le paramètre 'description' correspond à la description de l'évènement à instancier
     * @param b_date Le paramètre 'b_date' correspond à  de l'évènement à instancier
     * @param b_hour Le paramètre 'b_hour' correspond à  de l'évènement à instancier
     * @param e_date Le paramètre 'e_date' correspond à  de l'évènement à instancier
     * @param e_hour Le paramètre 'e_hour' correspond à  de l'évènement à instancier
     * @param importance Le paramètre 'importance' correspond à l'importance de la tâche à instancier
     */
    Event(String title, String category, String description, String b_date, String b_hour, String e_date, String e_hour, String importance) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.b_hour = b_hour;
        this.b_date = b_date;
        this.e_hour = e_hour;
        this.e_date = e_date;
        this.importance = importance;
    }
    /**
     * Cette méthode permet de récupérer les informations de l'évènement sous sa forme de stockage
     * @author Emmanuel
     * @return Une chaîne de caractères correspondant à l'évènement (sous sa forme de stockage)
     */
    public String getInfos() {
        return (title + "~" + category + "~" + description + "~" + b_date + "~" + b_hour + "~" + e_date + "~" + e_hour + "~" + importance + "~");
    }
    /**
     * Cette méthode permet de récupérer le titre de l'évènement
     * @author Evan
     * @return Une chaîne de caractères correspondant au titre de l'évènement
     */
    public String getTitre() {
        return title;
    }
    /**
     * Cette méthode permet de récupérer la catégorie de l'évènement
     * @author Evan
     * @return Une chaîne de caractères correspondant à la catégorie de l'évènement
     */
    public String getCat(){
        return category;
    }
    /**
     * Cette méthode permet de récupérer la description de l'évènemenet
     * @author Evan
     * @return Une chaîne de caractères correspondant à la description de l'évènement
     */
    public String getDesc() {
        return description;
    }
    /**
     * Cette méthode permet de récupérer la date de début de l'évènemenet
     * @author Evan
     * @return Une chaîne de caractères correspondant à la date de début de l'évènement
     */
    public String getBDate() {
        return b_date;
    }
    /**
     * Cette méthode permet de récupérer l'heure de début de l'évènemenet
     * @author Evan
     * @return Une chaîne de caractères correspondant à l'heure de début de l'évènement
     */
    public String getBHour() {
        return b_hour;
    }
    /**
     * Cette méthode permet de récupérer la date de fin de l'évènemenet
     * @author Evan
     * @return Une chaîne de caractères correspondant à la date de fin de l'évènement
     */
    public String getEDate() {
        return e_date;
    }
    /**
     * Cette méthode permet de récupérer l'heure de fin de l'évènemenet
     * @author Evan
     * @return Une chaîne de caractères correspondant à l'heure de fin de l'évènement
     */
    public String getEHour() {
        return e_hour;
    }
    /**
     * Cette méthode permet de récupérer l'importance de l'évènement
     * @return Une chaîne de caractères correspondant à la catégorie de l'évènement
     */
    public String getImp(){
        return importance;
    }
    /**
     * Cette méthode permet de modifier le titre de l'évènement
     * @author Evan
     */
    public void setTitre(String param){
       title = param;
    }
    /**
     * Cette méthode permet de modifier la catégorie de l'évènement
     * @author Evan
     */
    public void setCat(String param){
       category = param;
    }
    /**
     * Cette méthode permet de modifier la description de l'évènement
     * @author Evan
     */
    public void setDesc(String param){
       description = param;
    }
    /**
     * Cette méthode permet de modifier la date de début de l'évènement
     * @author Evan
     */
    public void setBDate(String param){
       b_date = param;
    }
    /**
     * Cette méthode permet de modifier l'heure de début de l'évènement
     * @author Evan
     */
    public void setBHour(String param){
       b_hour = param;
    }
    /**
     * Cette méthode permet de modifier la date de fin de l'évènement
     * @author Evan
     */
    public void setEDate(String param){
      e_date  = param;
    }
    /**
     * Cette méthode permet de modifier l'heure de fin de l'évènement
     * @author Evan
     */
    public void setEHour(String param){
       e_hour = param;
    }
    /**
     * Cette méthode permet de modifier le degré d'importance de l'évènement
     * @author Evan
     */
    public void setImp(String param){
       importance = param;
    }

}
