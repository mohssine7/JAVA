package OOP.Exceptions;

public class Main {

	public static void main(String[] args) {
		Kit kitDeDemarrage = new Kit();
		try {
			int resultat = kitDeDemarrage.getMotsCles().size();
			System.out.println("Nombre de mots clés : " + resultat);
		} catch (NullPointerException exception) {
			System.out.println("Liste de mots clés indisponible");
		}
	}
	
}
