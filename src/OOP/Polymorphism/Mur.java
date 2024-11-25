package OOP.Polymorphism;

public class Mur extends Bloc{
    private boolean porteur;

    public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
    }

    @Override
    public void afficheUneDescription() {
        System.out.println("“Je suis un mur !”");
    }


}
