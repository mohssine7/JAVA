package OOP.Class;

public class Class {
    // We need to add the attributes of the class
    String description;

    public Class(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // then the functions of the class
    void afficherDescription()
    {
        System.out.println(this.description);
    }
}
