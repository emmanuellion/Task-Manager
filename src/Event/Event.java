package Event;

/**
 * Cette classe permet d'instancier un objet 'Event' correspondant à une tâche créé
 * @author Evan
 */
public class Event {
    /**
     * Le paramètre 'title' correspond à une chaîne de caractères représentant le titre de l'évènement
     */
    private final String title;
    /**
     * Le paramètre 'category' correspond à une chaîne de caractères représentant la catégorie de l'évènement
     */
    private final String category;
    /**
     * Le paramètre 'description' correspond à une chaîne de caractères représentant la description de l'évènement
     */
    private final String description;
    /**
     * Le paramètre 'b_date' correspond à une chaîne de caractères représentant le jour de début de l'évènement
     */
    private final String b_date;
    /**
     * Le paramètre 'b_hour' correspond à une chaîne de caractères représentant l'heure de début de l'évènement
     */
    private final String b_hour;
    /**
     * Le paramètre 'e_date' correspond à une chaîne de caractères représentant le jour de fin de l'évènement
     */
    private final String e_date;
    /**
     * Le paramètre 'e_hour' correspond à une chaîne de caractères représentant l'heure de fin de l'évènement
     */
    private final String e_hour;
    /**
     * Le paramètre 'importance' correspond à une chaîne de caractères représentant l'importance de l'évènement
     */
    private final String importance;

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

    public String getDesc() {
        return description;
    }
    /**
     * Cette méthode permet de récupérer l'importance de l'évènement
     * @return Une chaîne de caractères correspondant à la catégorie de l'évènement
     */
    public String getImp(){
        return importance;
    }

}
