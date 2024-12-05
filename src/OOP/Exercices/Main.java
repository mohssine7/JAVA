package OOP.Exercices;

public class Main {
    public static void main(String[] args) {
        Mur mur = new Mur(11,12,2);
        Rempart monRempart = new Rempart(mur);
       System.out.println( monRempart.calcul(mur));
    }
}
