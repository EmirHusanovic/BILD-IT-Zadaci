package zadaci_12_02_2018;

import java.util.Scanner;

public class Treci {
	public static void main(String[] args) {
		System.out.print("Unesite prvi broj: ");
		Scanner unos=new Scanner (System.in);
		int prvi=unos.nextInt();
		System.out.print("Unesite drugo broj: ");
		int drugi=unos.nextInt();
		System.out.println("Najveci zajednicki djelilac je "+najveciZajednicki(prvi,drugi));
		
		
	}
	
	public static int najveciZajednicki(int prvi,int drugi){
		int najveci=0;
		for (int i=1;i<=prvi;i++){
			
			if (prvi%i==0 && drugi%i==0){
			najveci=i;	
			}
		}
		return najveci;
		
	}

}
