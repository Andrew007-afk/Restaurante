package cadenas;

import java.util.Scanner;

public class cadenaEjer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dame una palabra: ");
		palabra = sc.nextLine();
		
		for(int contador = palabra.length() -1; contador >= 0; contador--) {
			System.out.print(palabra.charAt(contador));
		}
		
		

	}

}
