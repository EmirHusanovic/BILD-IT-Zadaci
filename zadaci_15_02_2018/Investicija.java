package zadaci_15_02_2018;

import java.util.Scanner;

public class Investicija {
	public static void main(String[] args) {
		System.out.print("Unesite iznos investicije: ");
		Scanner unos = new Scanner(System.in);
		int investicija = unos.nextInt();
		System.out.print("Unesite godisnju interesnu stopu: ");
		double stopa = unos.nextDouble();
		System.out.print("Unesite broj godina: ");
		int godine = unos.nextInt();
		stopa = stopa / 1200;
		double vrInvesticije = investicija * Math.pow(1 + stopa, godine * 12);
		System.out.printf(" Vrijednost investicije je %.2f ", vrInvesticije);

	}

}
