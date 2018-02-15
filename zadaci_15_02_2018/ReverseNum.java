package zadaci_15_02_2018;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		System.out.print("Unesite vas broj: ");
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		System.out.println(isPalindrom(broj));

	}

	public static boolean isPalindrom(int broj) {

		if (broj == naopako(broj)) {
			return true;
		}
		return false;
	}

	public static int naopako(int broj) {
		int rez = 0;
		while (broj > 0) {
			rez = (rez * 10) + (broj % 10);
			broj = broj / 10;
		}
		return rez;
	}
}