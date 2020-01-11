import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kolekcijastringova {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		List<String> novaLista = new ArrayList<String>();
		System.out.println("Unesite kolekciju od 10 stringova");
		for (int i = 0; i < 10; i++) {
			String uneseniString = unos.nextLine();
			novaLista.add(uneseniString);
		}
		List<String> novijaLista = new ArrayList<String>();
		for (int i = 0; i < novaLista.size(); i++) {
			String privremeni = novaLista.get(i);
			if (privremeni.length() % 2 > 0) {
				novijaLista.add(privremeni);
			}
		}
		System.out.println("Elementi sa neparnim brojem slova su: " + novijaLista.toString());
		unos.close();
	}

}
