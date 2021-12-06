package Task;

/**
 * Cette classe permet d'instancier un objet 'Task' correspondant à une tâche créé
 * @author Evan
 */
public class Task {
    /**
     * Le paramètre 'title' correspond à une chaîne de caractères représentant le titre de la tâche
     */
    private final String title;
    /**
     * Le paramètre 'category' correspond à une chaîne de caractères représentant la catégorie de la tâche
     */
    private final String category;
    /**
     * Le paramètre 'description' correspond à une chaîne de caractères représentant la description de la tâche
     */
    private final String description;
    /**
     * Le paramètre 'b_date' correspond à une chaîne de caractères représentant le jour de début de la tâche
     */
    private final String b_date;
    /**
     * Le paramètre 'b_hour' correspond à une chaîne de caractères représentant l'heure de début de la tâche
     */
    private final String b_hour;
    /**
     * Le paramètre 'e_date' correspond à une chaîne de caractères représentant le jour de fin de la tâche
     */
    private final String e_date;
    /**
     * Le paramètre 'e_hour' correspond à une chaîne de caractères représentant l'heure de fin de la tâche
     */
    private final String e_hour;
    /**
     * Le paramètre 'importance' correspond à une chaîne de caractères représentant l'importance de la tâche
     */
    private final String importance;

    /**
     * Cette méthode permet d'instancier une nouvelle tâche avec les paramètres renseignés
     * @author Evan
     * @param title Le paramètre 'title' correspond au titre de la tâche à instancier
     * @param category Le paramètre 'category' correspond à la catégorie de la tâche à instancier
     * @param description Le paramètre 'description' correspond à la description de la tâche à instancier
     * @param b_date Le paramètre 'b_date' correspond à  de la tâche à instancier
     * @param b_hour Le paramètre 'b_hour' correspond à  de la tâche à instancier
     * @param e_date Le paramètre 'e_date' correspond à  de la tâche à instancier
     * @param e_hour Le paramètre 'e_hour' correspond à  de la tâche à instancier
     * @param importance Le paramètre 'importance' correspond à l'importance de la tâche à instancier
     */
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

    /**
     * Cette méthode permet de récupérer les informations de la tâche sous sa forme de stockage
     * @author Emmanuel
     * @return Une chaîne de caractères correspondant à l'évènement (sous sa forme de stockage)
     */
    public String getInfos() {
        return (title + "~" + category + "~" + description + "~" + b_date + "~" + b_hour + "~" + e_date + "~" + e_hour + "~" + importance + "~");
    }

    /**
     * Cette méthode permet de récupérer la catégorie de la tâche
     * @author Evan
     * @return Une chaîne de caractères correspondant à la catégorie de la tâche
     */
    public String getCat(){
        return category;
    }

    /**
     * Cette méthode permet de récupérer l'importance de la tâche
     * @return Une chaîne de caractères correspondant à la catégorie de la tâche
     */
    public String getImp(){
        return importance;
    }

}
