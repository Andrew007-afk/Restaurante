package condiciones;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
	
		int num;
		int num2;
		int opcion = 0;
		int resultado;
		Scanner sc = new Scanner(System.in);
		
		while(opcion != 5) {
			
			System.out.println("===============");
			System.out.println("  Calculadora  ");
			System.out.println("===============");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicaci�n");
			System.out.println("4. Divisi�n");
			System.out.println("5. Salir");
			System.out.println("===============");
			System.out.println("Elije la operaci�n que quieras realizar>> ");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Dame el primer n�mero: ");
				num = sc.nextInt();
				
				System.out.println("Dame el segundo n�mero: ");
				num2 = sc.nextInt();
				
				resultado = num + num2;
				
				System.out.println("El resultado de tu suma es " + resultado);
				
				System.out.println("Quieres seguir?");
				
				
				break;
				
			case 2:
				System.out.println("Dame el primer n�mero: ");
				num = sc.nextInt();
				
				System.out.println("Dame el segundo n�mero: ");
				num2 = sc.nextInt();
				
				resultado = num - num2;
				
				System.out.println("El resultado de tu resta es " + resultado);
				break;
				
			case 3:
				System.out.println("Dame el primer n�mero: ");
				num = sc.nextInt();
				
				System.out.println("Dame el segundo n�mero: ");
				num2 = sc.nextInt();
				
				resultado = num * num2;
				
				System.out.println("El resultado de tu multiplicaci�n es " + resultado);
				break;
				
			case 4:
				System.out.println("Dame el primer n�mero: ");
				num = sc.nextInt();
				
				System.out.println("Dame el segundo n�mero: ");
				num2 = sc.nextInt();
				
				resultado = num / num2;
				
				System.out.println("El resultado de tu divisi�n es " + resultado);
			    break;
			    
			case 5:
				break;
			    
			default:
				System.out.println("ERROR: Opci�n no encontrada");
				
			}
		}
		System.out.println("Final del programa");
		
		

	}

}
