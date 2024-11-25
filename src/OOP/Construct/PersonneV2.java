package OOP.Construct;

public class PersonneV2 {
    String name;
    String lastName;
    /**
     * Constructs a new instance of PersonneV2 with the given name and lastName.
     *
     * @param name The first name of the person. It cannot be null or empty.
     * @param lastName The last name of the person. It cannot be null or empty.
     */
    PersonneV2(final String name, final String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    private void afficherPersonne()
    {
        System.out.println("Nom: " + this.name + " & Prenom: " + this.lastName);
    }

    public static void main(String[] args) {
        PersonneV2 person = new PersonneV2("Mohssine", "ZERNOUN");
        person.afficherPersonne();
    }

}
