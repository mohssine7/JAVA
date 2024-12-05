package OOP.Exercices;

public class Mur extends Bloc{
    private int largeur;
    private int hauteur;
    private int profendeur;
    private int facade;

    public int getFacade() {
        return facade;
    }

    public void setFacade(int facade) {
        this.facade = facade;
    }

    public Mur(int largeur, int hauteur, int profendeur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getProfendeur() {
        return profendeur;
    }

    public void setProfendeur(int profendeur) {
        this.profendeur = profendeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void afficher() {
        System.out.println("La superfice est "+calculSuperficie(this.largeur, this.hauteur));
    }

    @Override
    public int calculSuperficie(int x, int y) {
        return x*y;
    }
}
