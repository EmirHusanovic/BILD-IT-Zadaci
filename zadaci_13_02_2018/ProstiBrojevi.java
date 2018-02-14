package zadaci_13_02_2018;

import java.util.Scanner;

public class ProstiBrojevi {
	public static void main(String[] args) {
		System.out.println("Unesite pocetni i krajnji broj !");
		Scanner unos=new Scanner (System.in);
		int pocetni=unos.nextInt();
		int krajnji=unos.nextInt();
		prostiBroj(pocetni,krajnji);
	}
	
	public static void prostiBroj (int pocetni,int krajnji){
		
		for (int i=pocetni;i<krajnji;i++){
			if (isProst(i)){
				System.out.println(i);
			}
		}
	}

	public static boolean isProst (int num){
		if(num%2==0){
			return false;
		}
		for(int i = 3;i*i<num;i+=2) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
