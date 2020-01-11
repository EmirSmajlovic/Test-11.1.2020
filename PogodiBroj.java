import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PogodiBroj {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		List<Integer> novaLista = new ArrayList<Integer>();

		for (int i = 0; i < 101; i++) {
			int randomBroj = (int) (1 + Math.random() * 10);
			novaLista.add(randomBroj);
		}
		System.out.println("Pogodi moj broj:");
		int pokusaj = unos.nextInt();
		boolean uspjeh = false;
		for (int i = 0; i < novaLista.size(); i++) {
			if (pokusaj == novaLista.get(i)) {
				System.out.println("Svaka cast");
				uspjeh = true;
				break;
			}
		}
		if (uspjeh) {
			System.out.println("Pogodili ste broj iz moje tajne kolekcije!");
		} else {
			System.out.println("Wah wah wah");
		}
		unos.close();
	}

}
