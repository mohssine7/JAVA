package OOP.Exercices;

public class Rempart {
    private IBloc bloc;

    public Rempart(final IBloc bloc) {
        this.bloc = bloc;
    }
    public int calcul(final IBloc bloc) {
        int result =  bloc.HAUTEUR*bloc.LARGEUR;;
        return result;
    }

}
