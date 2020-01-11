import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Unikatnibrojevi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vase brojeve, unos 0 prekida unos");
		List<Integer> novaLista = new ArrayList<Integer>();
		for (int i = 0; i < novaLista.size() + 1; i++) {
			int broj = unos.nextInt();
			novaLista.add(broj);
			if (broj == 0) {
				break;
			}
		}

		Set<Integer> noviSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < novaLista.size() - 1; i++) {
			noviSet.add(novaLista.get(i));

		}
		System.out.println("Unikatni brojevi su: ");
		System.out.println(noviSet.toString());

		unos.close();
	}

}
