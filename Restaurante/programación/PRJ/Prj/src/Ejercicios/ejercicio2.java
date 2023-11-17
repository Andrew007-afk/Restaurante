package Ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radio;
		double area;
		double longitud;
		
		System.out.println("Dime el radio de tu círculo: ");
		radio = sc.nextDouble();
		
		area = (3.14 * (radio * radio));
		longitud = (2 * 3.14 * radio);	
		
		System.out.println("El area de tu círculo es " + area);
		System.out.println("La longitud de tu círculo es " + longitud);

	}

}
