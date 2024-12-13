package EpicrafterJourneyProject;

public class Bloc {

    private int longeur;
    private int largeur;
    private int hauteur;

    public Bloc(int longeur, int largeur, int hauteur) {
        this.longeur = longeur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public float getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
}
