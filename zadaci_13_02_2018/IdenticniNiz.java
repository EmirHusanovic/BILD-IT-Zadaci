package zadaci_13_02_2018;

public class IdenticniNiz {
	public static void main(String[] args) {
		int [] niz1=new int[10];
		int [] niz2=new int[10];
		for (int i=0;i<10;i++){
			niz1[i]=i;
			niz2[i]=i;
		}
		
		
		System.out.println(equals(niz1,niz2));
	}
	
	public static boolean equals(int[] niz1, int[] niz2){
		if (niz1.length!=niz2.length){
			return false;
		}
      for (int i=0;i<niz1.length-1;i++){
    	 
    	  if (niz1[i]!=niz2[i]){
    		  return false;
    	  };
      }
	return true;	
	}
	

}
