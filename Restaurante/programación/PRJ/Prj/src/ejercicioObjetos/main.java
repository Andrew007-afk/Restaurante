package ejercicioObjetos;

import java.util.Scanner;


import coche.Coche;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int plazas1;
		String matricula1;
		int nruedas1;
		String modelo1;
		String marca1;
		double litros1;
		int opcion = 0;
		
		System.out.println("¿Cuantas plazas tiene tu coche?");
		plazas1 = sc.nextInt();
		System.out.println("¿Cuál es la matrícula de tu coche?");
		matricula1 = sc2.nextLine();
		System.out.println("¿Cuántas ruedas tiene tu coche?");
		nruedas1 = sc.nextInt();
		System.out.println("¿Cuál es el modelo de tu coche?");
		modelo1 = sc2.nextLine();
		System.out.println("¿Cuál es la marca de tu coche?");
		marca1 = sc2.nextLine();
		System.out.println("¿Cuántos litros de gasolina tiene tu coche?");
		litros1 = sc.nextInt();
		
		Coche coche1 = new Coche(plazas1, matricula1, nruedas1, modelo1, marca1, litros1);
		
		while(opcion != 5) {
			System.out.println("====================");
			System.out.println("   MODO CONDUCIR");
			System.out.println("====================");
			System.out.println("¿Que opción deseas realizar?");
			System.out.println("1. Repostar gasolina");
			System.out.println("2. Moverse");
			System.out.println("3. Consultar cuánto deposito te queda");
			System.out.println("4. Pitar");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("¿Cuantos litros quieres ingresar en tu vehículo?");
				double adepositar = sc.nextInt();
				coche1.litros = (coche1.repostar(coche1.litros, adepositar));
				System.out.println("Acción realizada exitosamente :D");
				System.out.println("+ " + adepositar + "l");
				System.out.println("");
				break;
				
			case 2:
				if(coche1.litros <= 0) {
					System.out.println("No tienes gasolina :(");
					System.out.println("Recarga para poder continuar");
					System.out.println("");
					break;
				}else {
					System.out.println("¿Cuántos kilómetros desea moverse?");
					double kilometros = sc.nextInt();
					double kilometrost = kilometros * 0.05;
					
					
					
					if(kilometrost > coche1.litros) {
							System.out.println("No te alcanza la gasolina para realizar este movimiento :v");
							System.out.println("Si quieres moverte esta distancia recarga gasolina");
							System.out.println("");
							break;
					}else {
							coche1.litros = coche1.moverse(coche1.litros, kilometros);
							if(coche1.litros == 0) {
								System.out.println("Te has movido "  + kilometros + "km :o");
								System.out.println("- " + kilometrost + "l de gasolina");
								System.out.println("");
								System.out.println("Con este movimiento te has quedado sin gasolina ¬¬_");
								System.out.println("Si quieres realizar otro movimiento tendrás que recargar gasolina");
								System.out.println("");
								break;
								
							}else {
								System.out.println("Te has movido "  + kilometros + "km");
								System.out.println("- " + kilometrost + "l de gasolina");
								System.out.println("");
								break;
							}
							
					}
						
					
				}
				
				
				
				
			case 3:
				if(coche1.litros <= 0) {
					System.out.println("No te queda gasolina D:");
					System.out.println("");
					break;
				}else if(coche1.litros < 10) {
					System.out.println("Te quedan " + coche1.litros + ":o");
					System.out.println("");
					break;
				}else {
					System.out.println("Te quedan " + coche1.litros + "l ;)");
					System.out.println("");
				}
				
				break;
				
			case 4:
				System.out.println(coche1.pitar());
				System.out.println("");
				break;
			}
			
		}
		
		
		
		
		
		
		
		

	}

	

}
