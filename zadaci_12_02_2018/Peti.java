package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class Peti {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		System.out.println("Unesite vase brojeve: ");
		Scanner unos = new Scanner(System.in);
		int brojevi = unos.nextInt();
		while (brojevi > 0) {
			lista.add(brojevi);
			brojevi = unos.nextInt();
		}
		int max = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > max) {
				max = lista.get(i);
			}

		}
		int count = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (max == lista.get(i)) {
				count++;
			}
		}
		System.out.println("Najveci broj je " + max + " a ponavlja se " + count + " puta.");
	}

}
