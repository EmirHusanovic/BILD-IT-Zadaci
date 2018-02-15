package zadaci_15_02_2018;

import java.util.Scanner;

public class prestupGod {

	public static void main(String[] args) {
		System.out.println("Unesite pocetnu godinu: ");
		Scanner unos = new Scanner(System.in);
		int pocetna = unos.nextInt();
		System.out.println("Unesite zavrsnu godinu: ");
		int zavrsna = unos.nextInt();
		int brojac = 0;
		for (int i = pocetna; i <= zavrsna; i++) {

			if (i % 4 == 0 && i % 100 != 0) {
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println(" " + i);
				} else {
					System.out.print(" " + i);
				}

			}
		}

	}
}
