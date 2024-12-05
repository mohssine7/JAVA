package OOP.Exercices;

public interface IBloc {
    int LARGEUR = 10;
    int HAUTEUR = 5;

    private int calculSuperficie(int x, int y) {
        return x*y;
    }
}
