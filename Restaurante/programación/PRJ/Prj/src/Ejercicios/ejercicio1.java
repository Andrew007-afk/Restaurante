package Ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número>> ");
		num = sc.nextInt();
		
		if(num >= 0 && num <= 100) {
			System.out.println("Esta dentro del rango");
		}else {
			System.out.println("Esta fuera del rango");
		}
	}

}
