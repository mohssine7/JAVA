package OOP.Heritage;

public class firefighter extends Person {
    String military_rank;

    public firefighter(String name, int age, String address, String city, String country, String military_rank) {
        super(name, age, address, city, country);
        this.military_rank = military_rank;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Military Rank: " + military_rank);
    }



}
