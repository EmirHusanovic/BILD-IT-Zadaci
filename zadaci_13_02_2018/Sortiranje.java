package zadaci_13_02_2018;

import java.util.Scanner;

public class Sortiranje {
	public static void main(String[] args) {
		System.out.print("Unesite dimenziju vase matrice: ");
		Scanner unos = new Scanner(System.in);
		int dim = unos.nextInt();
		double[][] niz = new double[dim][dim];
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				niz[i][j] = unos.nextDouble();
			}
		}
		sortRows(niz);

	}

	public static int sortRows(double[][] array) {

	}

}
