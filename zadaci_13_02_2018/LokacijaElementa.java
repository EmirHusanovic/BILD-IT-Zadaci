package zadaci_13_02_2018;

import java.util.Scanner;

public class LokacijaElementa {
	public static void main(String[] args) {
		double[][] niz = new double[3][3];
		System.out.println("Unesite vase brojeve: ");
		Scanner unos = new Scanner(System.in);

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				niz[i][i] = unos.nextDouble();

			}
		}
		locateLargest(niz);

	}

	public static void locateLargest(double[][] niz) {
		double max = 0;
		int red = 0;
		int kolona = 0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				if (niz[i][j] > max) {
					max = niz[i][j];
					red = i;
					kolona = j;
				}
			}
		}
		System.out.println("Najveci element se nalazu u redu " + red + " i u koloni" + kolona);
	}
}
