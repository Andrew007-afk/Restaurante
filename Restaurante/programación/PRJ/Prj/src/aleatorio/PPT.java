package aleatorio;

import java.util.Random;
import java.util.Scanner;

public class PPT {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		int mOpcion;
		int c = 0;
		int cy = 0;
		int cm = 0;
		String contador;
		String yo = null;
		String maq = null;
		String eleccion;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(c < 3) {
			System.out.println("==========================");
			System.out.println("  PIEDRA PAPEL O TIJERA   ");
			System.out.println("==========================");
			
			System.out.println("Selecciona tu opción");
			System.out.println("1. Piedra");
			System.out.println("2. Papel");
			System.out.println("3. Tijera");
			opcion = sc.nextInt();
			System.out.println("");
			mOpcion = rand.nextInt(1,4);
			
			
			if(opcion == 1) {
				yo = "Piedra";
			}else if(opcion == 2){
				yo = "Papel";
			}else if(opcion == 3) {
				yo = "Tijera";
			}
			
			if(mOpcion == 1) {
				maq = "Piedra";
			}else if(mOpcion == 2){
				maq = "Papel";
			}else if(mOpcion == 3) {
				maq = "Tijera";
			}
			
			eleccion = ("Has elegido " + yo + "\nLa CPU ha elegido " + maq + "\n");
			contador = ("Marcador: " + cm + " - " + cy);
			
			if(opcion == mOpcion) {
				System.out.println(eleccion);
				System.out.println("Empate \n");
				System.out.println(contador);
				System.out.println();
			}else if(opcion == 1 && mOpcion == 2 || opcion == 2 && mOpcion == 3 || opcion == 3 &&  mOpcion == 1) {
				System.out.println(eleccion);
				System.out.println("Has perdido :( \n");
				cm++;
				System.out.println(contador);
				System.out.println();
			}else if(opcion == 1 && mOpcion == 3 || opcion == 2 && mOpcion == 1 || opcion == 3 && mOpcion == 2) {
				System.out.println(eleccion);
				System.out.println("Has ganado :) \n");
				cy++;
				System.out.println(contador);
				System.out.println();
			}
			c++;
		}

	}

}
