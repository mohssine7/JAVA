package OOP.Collections;

import java.util.HashSet;

public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        cars.contains("Mazda");
        cars.remove("Volvo");
        cars.clear();
        System.out.println(cars);
    }
}
//In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.