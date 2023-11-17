package aleatorio;

import java.util.Random;
import java.util.Scanner;

public class canicas {
	public static void main(String args[]) {
		int cm = 10;
		int ct = 10;
		int cs;
		int cst;
		int pi;
		int pim;
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("  EL JUEGO DE LAS CANICAS    ");
		System.out.println("============================="); 
		System.out.println("Elige par o impar \n1.Par\2.Impar");
		pi = sc.nextInt();
		
		pim = rand.nextInt(2);
		
		System.out.println("Cuantas canicas vas a sacar?");
		cs = sc.nextInt();
		
		if(cs > cm) {
			System.out.println("No puedes sacar más canicas de las que tienes");
		}
		
		
		
		
		
		
		
	}

}
