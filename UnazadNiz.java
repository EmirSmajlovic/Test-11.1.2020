import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnazadNiz {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vase brojeve, 0 prekida unos:");
		List<Integer> novaLista = new ArrayList<Integer>();
		int broj;
		do {
			broj = unos.nextInt();
			novaLista.add(broj);
		} while (broj != 0);
		for (int i = novaLista.size() - 2; i >= 0; i--) {
			System.out.print(novaLista.get(i) + " ");

		}
		unos.close();
	}

}
