package OOP.Exceptions;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kit {
    private Set<String> motsCles;
    private Set<IBloc> blocs = new LinkedHashSet<>();

    public Kit() {
        blocs.add(new Mur(3, 2, 2, true));
        blocs.add(new Mur(3, 2, 2, true));
        blocs.add(new Mur(2, 1, 2, false));
        blocs.add(new Mur(2, 1, 2, false));
        blocs.add(new Porte(1, 2, 2, true));
    }

    public void afficherKit() {
        System.out.println("Nombre de bloc dans le kit : " + this.blocs.size());
        System.out.print("Liste des mots clés du kit : ");

        for (String motCle : motsCles) {
            System.out.print(motCle);
        }
    }

    public Set<String> getMotsCles() {
        return motsCles;
    }

    public Set<IBloc> getBlocs() {
        return blocs;
    }

}
