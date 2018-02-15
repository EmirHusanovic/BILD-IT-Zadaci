package zadaci_15_02_2018;
import java.util.Scanner;

public class NeparniPoz {

	public static void main(String[] args) {
		int[] niz = new int[10];
		System.out.println("Unesite elemente vaseg niza: ");
		Scanner unos = new Scanner(System.in);
		String izjava=unos.nextLine();
		neparni(izjava);

	}

	public static void neparni(String s) {

		for (int i = 0; i <s.length(); i += 2) {

			System.out.print(s.charAt(i));

		}
	}
}
