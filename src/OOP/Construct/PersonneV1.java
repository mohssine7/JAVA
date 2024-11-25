package OOP.Construct;

public class PersonneV1 {
    String name;
    String lastName;

    /**
     * allocate values to the variables
     */
    PersonneV1(){
       this.name = "Mohssine";
       this.lastName = "ZERNOUN";
    }

    private void afficherPersonne()
    {
        System.out.println("Nom: " + this.name + " & Prenom: " + this.lastName);
    }

    public static void main(String[] args) {
        PersonneV1 person = new PersonneV1();
        person.afficherPersonne();
    }

}
