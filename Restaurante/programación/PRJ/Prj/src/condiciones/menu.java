package condiciones;

import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Elije una opción(Entre 1 y 4)");
		 opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Has elejido la opción 1");
			break;
			
		case 2:
			System.out.println("Has elejido la opción 2");
			break;
		
		case 3: 
			System.out.println("Has elejido la opción 3");
			break;
			
		case 4:
			System.out.println("Has elejido la opción 4");
			break;
			
		default:
			System.out.println("ERROR: opción desconocido");
		}
	}

}
