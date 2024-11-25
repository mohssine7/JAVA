package OOP.Overloading;

public class Mur extends Bloc {
    private boolean porteur;

    public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
    }

    public void afficheUneDescription(final String description) {
        System.out.println(description);
    }

    public void afficheUneDescription() {
        this.afficheUneDescription("“Je suis un mur !”");
    }


}
