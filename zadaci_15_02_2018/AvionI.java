package zadaci_15_02_2018;

import java.util.Scanner;

public class AvionI {
	
	public static void main(String[] args) {
		System.out.print("Unesite brzinu: ");
		Scanner unos=new Scanner(System.in);
		double brzina=unos.nextDouble();
		System.out.println("Unesite ubrzanje: ");
		double ubrzanje=unos.nextDouble();
		double duzina=(brzina*brzina)/(2*ubrzanje);
		System.out.printf("Duzina piste je: %.2f ", duzina);
	}

}
