package OOP.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionListSorting {
    public static void main(String[] args) {
        // Déclarez la liste avec un type générique pour éviter les avertissements
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Triez la liste
        Collections.sort(cars);

        // Affichez les éléments de la liste triée
        for (String car : cars) {
            System.out.println(car);
        }
    }
}

