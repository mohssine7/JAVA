package OOP.Overloading;

public class Main {
    public static void main(String[] args) {
        Bloc unBloc = new Mur(10,10,5,true); // La variable est typé Bloc mais l’instance est bien Mur.unBloc.afficheUneDescription();
        unBloc.afficheUneDescription();
    }
}
