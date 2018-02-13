package zadaci_12_02_2018;

import java.util.Scanner;

public class Drugi {
	public static void main(String[] args) {
		System.out.println("Molimo unesite neki string: ");
		Scanner unos = new Scanner(System.in);
		String izjava = unos.nextLine();
		int samoglasnici = 0;
		int suglasnici = 0;
		String izjava1 = izjava.replaceAll("\\s+", "");
		for (int i = 0; i < izjava1.length(); i++) {
			if (izjava1.charAt(i) == 'A' || izjava1.charAt(i) == 'E' || izjava1.charAt(i) == 'I'
					|| izjava1.charAt(i) == 'O' || izjava1.charAt(i) == 'U' || izjava1.charAt(i) == 'a'
					|| izjava1.charAt(i) == 'e' || izjava1.charAt(i) == 'i' || izjava1.charAt(i) == 'o'
					|| izjava1.charAt(i) == 'u') {
				samoglasnici++;
			} else {
				suglasnici++;
			}
		}

		System.out.println("Samoglasnika ima " + samoglasnici + " " + "a suglasnika " + suglasnici);
	}

}
