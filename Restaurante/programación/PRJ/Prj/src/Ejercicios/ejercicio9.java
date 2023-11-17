package Ejercicios;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int digito1;
		int digito2;
		int digito2_1;
		int digito3;
		
	    int valor;
	    
	    System.out.println("Dame un valor: ");
	    valor = sc.nextInt();
		

		digito1 = valor/100;
		
		digito2_1 = valor/10;
		digito2 = digito2_1%10;
		digito3 = (valor%10);
		
		
		System.out.println(digito1 + " - " + digito2 + " - " + digito3);
		
		
	}

}
