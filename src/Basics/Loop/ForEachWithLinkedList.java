package Basics.Loop;

import java.util.Arrays;
import java.util.List;

public class ForEachWithLinkedList {
    public static void main(String[] args) {
        List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript");
        for (String nomDuLangage : nomsDesLangages) {
            System.out.println(nomDuLangage.toUpperCase());
        }
    }
}
