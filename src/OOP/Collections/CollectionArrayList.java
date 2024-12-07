package OOP.Collections;

public class CollectionArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        java.util.ArrayList<String> names = new java.util.ArrayList<>();

        // Add elements to the ArrayList
        names.add("John");
        names.add("Doe");
        names.add("Alice");

        // Print the ArrayList
        System.out.println("ArrayList: " + names);

        // Remove an element from the ArrayList
        names.remove("Alice");

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + names);

        // Get the size of the ArrayList
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        // Check if the ArrayList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // Get the first element of the ArrayList
        String firstElement = names.get(0);

    }


}
