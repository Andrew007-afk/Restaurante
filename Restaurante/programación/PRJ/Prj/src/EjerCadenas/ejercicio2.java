package EjerCadenas;

import java.util.Scanner;

/*Haz un programa que pida al usuario un texto y muestre cuántas vocales tiene. Las vocales pueden ser mayúsculas o minúsculas. Por ejemplo: si el string es 
 * "CadEnA", mostrará "CadEnA tiene 3 vocales"*/



public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra;
		int nVocales = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame una palabra: ");
		palabra = sc.nextLine();
		
		for(int c = 1; c <= palabra.length(); c++) {
			char letra = palabra.charAt(c-1);
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' ||letra == 'U') {
				nVocales++;
			}
				
		}
		
		System.out.println("Tu palabra tiene " + nVocales + " vocales");
		

	}

}
