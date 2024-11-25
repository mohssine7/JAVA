package Basics.Fonctions;

public class Fonctions {

    // fonction qui ne retourne aucune valeur
    public static void afficherMessage() {
        System.out.println("Hello World!");
    }

    // fonction qui retourne une valeur
    public static int addition(int a, int b) {
        return a + b;
    }
    // fonction récursive
    public static void decompte(final int valeur) {
        if (valeur >= 0) {
            System.out.println(valeur);
            decompte(valeur - 1);
        }
    }
    public static void main(String[] args) {
        Fonctions f = new Fonctions();
        f.afficherMessage();
        int result = f.addition(1, 1);
        System.out.println("La somme est: " + result);
        f.decompte(10);
    }

}