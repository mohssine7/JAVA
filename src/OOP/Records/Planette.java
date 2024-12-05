package OOP.Records;

public record Planette(String nom, double perimetre, int superficie) {
    @Override
    public double perimetre() {
        return perimetre;
    }

    @Override
    public String nom() {
        return nom;
    }

    @Override
    public int superficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return "Planette{" +
                "nom='" + nom + '\'' +
                ", perimetre=" + perimetre +
                ", superficie=" + superficie +
                '}';
    }
}
