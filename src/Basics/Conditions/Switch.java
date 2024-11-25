package Basics.Conditions;

public class Switch {
    public static void apartmentsV1(final int number) {
        switch (number) {
            case 1:
                System.out.println("C'est l'appartement de M. ZERNOUN");
                break;
            case 2:
                System.out.println("C'est l'appartement de Mme.Benalluch");
                break;
            case 3:
                System.out.println("C'est l'appartement des enfants");
                break;
            default:
                System.out.println("Veuillez appuyez sur l'interphone");
        }
    }
    public static void apartmentsV2(final int number) {
        switch (number) {
            case 1 -> System.out.println("C'est l'appartement de M. ZERNOUN");

            case 2 -> System.out.println("C'est l'appartement de Mme.Benalluch");

            case 3 -> System.out.println("C'est l'appartement des enfants");

            default -> System.out.println("Veuillez appuyez sur l'interphone");
        }
    }
    public static String categorieDeFilm(final String film) {
        var resultat = switch (film) {
            case "Star Wars" -> "Science fiction";
            case "Blanche neige", "La petite sirène" -> "Disney";
            case "Indiana Jones" -> {
                String categorie = "Aventure";
                yield categorie;
            }
            default -> "Inconnu";
        };
        return resultat;
    }

    public static void main(String[] args) {
        Switch.apartmentsV1(5);
        Switch.apartmentsV2(3);
        System.out.println(Switch.categorieDeFilm("Indiana Jones"));
    }
}
