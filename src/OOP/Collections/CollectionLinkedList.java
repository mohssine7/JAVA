package OOP.Collections;

public class CollectionLinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();

        // Add elements to the linked list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the linked list
        System.out.println("Linked List: " + list);

        // Remove an element from the linked list
        list.remove("Banana");

        // Print the updated linked list
        System.out.println("Updated Linked List: " + list);

    }


}
