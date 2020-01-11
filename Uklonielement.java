import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uklonielement {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		List<Integer> novaLista = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int randomBroj = (int) (Math.random() * 200);
			novaLista.add(randomBroj);
		}
		System.out.println("Generisana kolekcija: " + novaLista.toString());
		System.out.println("Unesite indekse elemenata koje zelite da uklonite: ");
		int prviElement = unos.nextInt();
		int drugiElement = unos.nextInt();
		novaLista.remove(prviElement);
		novaLista.remove(drugiElement);
		System.out.println("Nova kolekcija: " + novaLista.toString());
		unos.close();
	}

}
