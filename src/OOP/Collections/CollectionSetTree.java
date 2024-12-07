package OOP.Collections;

import java.util.LinkedHashSet;
import java.util.Set;
public class CollectionSetTree {
    public static void main(String[] args) {
        Set<String> motsCles = new LinkedHashSet<String>();
        motsCles .add("Cabane");
        motsCles .add("Cabane");
        motsCles .add("Muraille");

        for(String motCle : motsCles) {
            System.out.println(motCle);
        }
    }
}
