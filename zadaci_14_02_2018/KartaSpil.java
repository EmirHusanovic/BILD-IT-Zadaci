package zadaci_14_02_2018;

public class KartaSpil {
	
		public static void main(String[] args) {
			int broj = (int) (Math.random() * 11 + 1);
			int broj1 = (int) (Math.random() * 4 + 1);
			String znak = " ";
			switch (broj1) {
			case 1:
				znak = "srca";
				break;
			case 2:
				znak = "pika";
				break;
			case 3:
				znak = "djeteline";
				break;
			case 4:
				znak = "kocke";
				break;

			}

			switch (broj) {
			case 1:
				System.out.println("Karta koju ste izvukli je A, u znaku " + znak+".");
				break;
			case 2:
				System.out.println("Karta koju ste izvukli je 2, u znaku " + znak+".");
				break;
			case 3:
				System.out.println("Karta koju ste izvukli je 3, u znaku " + znak+".");
				break;
			case 4:
				System.out.println("Karta koju ste izvukli je 4, u znaku " + znak+".");
				break;
			case 5:
				System.out.println("Karta koju ste izvukli je 5, u znaku " + znak+".");
				break;
			case 6:
				System.out.println("Karta koju ste izvukli je 6, u znaku " + znak+".");
				break;
			case 7:
				System.out.println("Karta koju ste izvukli je 7, u znaku " + znak+".");
				break;
			case 8:
				System.out.println("Karta koju ste izvukli je 8, u znaku " + znak+".");
				break;
			case 9:
				System.out.println("Karta koju ste izvukli je 9, u znaku " + znak+".");
				break;
			case 10:
				System.out.println("Karta koju ste izvukli je 10, u znaku " + znak+".");
				break;
			case 12:
				System.out.println("Karta koju ste izvukli je J, u znaku " + znak+".");
				break;
			case 13:
				System.out.println("Karta koju ste izvukli je Q, u znaku " + znak+".");
				break;
			case 14:
				System.out.println("Karta koju ste izvukli je K, u znaku " + znak+".");
				break;
			}

		}
	

}
