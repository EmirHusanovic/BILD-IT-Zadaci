package zadaci_13_02_2018;

public class NajmanjiElement {
	public static void main(String[] args) {
		double[] niz = new double[4];
		niz[0] = 3.2;
		niz[1] = 5.7;
		niz[2] = 2.9;
		niz[3] = 8.0;
		System.out.println("Najmanji u nizu je: " + min(niz));
	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {

			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
