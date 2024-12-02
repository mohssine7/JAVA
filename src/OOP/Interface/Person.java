package OOP.Interface;

public class Person implements specification{
    public String name;

    @Override
    public void afficherDescription() {
        System.out.println(this.name);
    }
}
