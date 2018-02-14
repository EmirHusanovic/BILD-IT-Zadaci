package zadaci_14_02_2018;

import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		System.out.print("Unesite prvi string: ");
		Scanner unos = new Scanner(System.in);
		String prvi = unos.nextLine();
		System.out.print("Unesite drugi string: ");
		String drugi = unos.nextLine();
		poredi(prvi, drugi);

	}

	public static void poredi(String a, String b) {
		String str = "";
		int duzina = a.length();
		int duzina1 = b.length();
		if (duzina < duzina1) {
			for (int i = 0; i < duzina; i++) {
				if (a.charAt(i) == b.charAt(i)) {
					str += a.charAt(i);
				} else {

					break;
				}

			}
		} else if (duzina > duzina1) {
			for (int i = 0; i < duzina1; i++) {
				if (a.charAt(i) == b.charAt(i)) {
					str += a.charAt(i);
				} else {

					break;
				}

			}

		}
		if (str.isEmpty()) {
			System.out.println("Nema zajednickog prefiksa");
		} else {
			System.out.println("Zajednicki prefiks za dva stringa je " + str);
		}
	}

}
