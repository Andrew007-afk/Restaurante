package aleatorio;

import java.util.Random;
import java.util.Scanner;

public class dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
	    
	    String vacio = null;
	    Scanner sc = new Scanner(System.in);
	    
	    
	    
	    while(vacio != "no") {
	    	int num = rand.nextInt(1,7);
	    	System.out.println("Tira el dado");
		    vacio = sc.nextLine();
	    	System.out.println(num);
	    }
		
		

	}

}
