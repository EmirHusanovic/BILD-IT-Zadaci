package zadaci_14_02_2018;

import java.util.Scanner;

public class BrSLO {

	public static void main(String[] args) {
		System.out.print("Unesite neki string: ");
		Scanner unos = new Scanner(System.in);
		String str = unos.nextLine();

		System.out.println("Vas string ima " + countLetters(str) + " slova");
	}

	public static int countLetters(String str) {
		int br = 0;
		int duz = str.length();
		for (int i = 0; i < duz; i++) {

			if (Character.isLetter(str.charAt(i))) {
				br++;
			}
		}

		return br;
	}

}
