package zadaci_12_02_2018;

public class Cetvrti {
	public static void main(String[] args) {

		int[] niz = new int[100];
		for (int i = 0; i < 100; i++) {
			int rand = (int) (Math.random() * 10);
			niz[i] = rand;
		}

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < niz.length; j++) {
				if (niz[j] == i) {
					count++;
				}

			}
			System.out.println("Broj " + i + " se ponavlja " + count + " puta.");
		}
	}

}
