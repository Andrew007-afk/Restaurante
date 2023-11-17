package EjerCadenas;

import java.util.Scanner;

/*Haz un programa que pida al usuario un texto y muestre sus caracteres separados por guiones. Por ejemplo: si el string es "HOLA", saldría "H-O-L-A".*/

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame una palabra: ");
		palabra = sc.nextLine();
		
		for(int c = 1; c <= palabra.length(); c++) {
			System.out.print(palabra.charAt(c -1) + "-");
		}

	}

}
