package zadaci_14_02_2018;

import java.util.Scanner;

public class ObrnutRedo {

	public static void main(String[] args) {
		brojevi();

	}

	public static void brojevi() {
		int[] niz = new int[10];
		System.out.print("Unesite deset cijelih brojeva! ");
		Scanner unos = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			niz[i] = unos.nextInt();

		}

		for (int i = 9; i > 0; i--) {
			System.out.println(niz[i]);
		}

	}

}
