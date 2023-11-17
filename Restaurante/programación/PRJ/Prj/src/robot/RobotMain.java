package robot;

import java.util.Scanner;

import robotClase.Robot;

/*
 * Un contador de galletas crudas
 * Un contador de galletas horneadas
 * Una capacidad de horno(número de galletas que caben)
 * Un contador de galletas envasadas
 * Un depósito de dinero
 * Un coste en €/galleta envasada
 * 
 * Incrementar la cantidad de galletas crudas
 * Hornear una cantidad de su contador de galletas crudas
 * Envasar una cantidad de su contador de galletas horneadas
 * Vender una cantidad de sus galletas envasadas con el coste configurado
*/

public class RobotMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int opcionInicio = 0;
		
		int gc = 0;
		int gh = 0;
		int capacidad;
		int ge = 0;
		float dinero = 0;
		float coste = 0.50F;
		float precio;
		
		
		
		
		System.out.println("ANTES DE COMENZAR DEBEMOS HECERTE UN PAR DE PREGUNTAS");
		System.out.println("------------------------------------------------------");
		System.out.println("CUAL SERA LA CAPACIDAD DE ALMECENAMIENTO DE TU ROBOT?");
		capacidad = sc.nextInt();
		System.out.println("CUANTO COSTARA CADA GALLETA HORNEADA?");
		precio = sc.nextFloat();
		
		Robot robotron = new Robot(gc, gh, capacidad, ge, dinero, coste, precio);
		
		while(opcion != 3) {
			System.out.println("=========================");
			System.out.println("        ROBOT X          ");	 	
			System.out.println("=========================");
			System.out.println("1. Robot de las galletas");
			System.out.println("2. Robot bancario");
			System.out.println("3. Salir");
			opcionInicio = sc.nextInt();
			
			switch(opcionInicio) {
			case 1:
				while(opcion != 6) {
					System.out.println("=========================");
					System.out.println("  ROBOT DE LAS GALLETAS  ");	 	
					System.out.println("=========================");
					System.out.println("1. Agregar galletas crudas");
					System.out.println("2. Hornear galletas crudas");
					System.out.println("3. Envasar galletas horneadas");
					System.out.println("4. Almacen de galletas");
					System.out.println("5. Vender galletas envasadas");
					System.out.println("6. Atras");
					opcion = sc.nextInt();
					switch(opcion) {
					case 1:
						
						titulo("AGREGAR GALLETAS CRUDAS");
						
						System.out.println("Cuantas galletas crudas desea almacenar a su robot?");
						int galletasSumar = sc.nextInt();
						
						if((galletasSumar + robotron.galletasC) > robotron.capacidad) {
							System.out.println("No se puede realizar esta operacion");
							System.out.println("Superas la capacidad de tu robot");
							break;
						}else {
							robotron.galletasC = robotron.galletasC + galletasSumar;
							System.out.println("Accion realizada correctamente");
							System.out.println("Ahora tienes " + robotron.galletasC + " galletas crudas"); 
							break;
						}
						
						
					case 2: 
						titulo("HORNEAR GALLETAS CRUDAS");
						System.out.println("Cuantas galletas crudas deseas hornear?");
						int galletas = sc.nextInt();
						
						
						if(galletas > robotron.galletasC) {
							System.out.println("No tienes suficientes galletas crudas");
							robotron.galletasC = robotron.galletasC + galletas;
							break;
						}else if((galletas + robotron.galletasC) > robotron.capacidad) {
							System.out.println("No se puede realizar esta operacion");
							System.out.println("Superas la capacidad de tu robot");
							robotron.galletasC = robotron.galletasC + galletas;
							break;
						}else {
							robotron.galletasC = robotron.galletasC - galletas;
							robotron.galletasH = robotron.agregar(galletas, robotron.galletasH);
							
							System.out.println("Ahora tienes " + robotron.galletasH + "galletas horneadas");
							
							System.out.println("Accion realizada correctamente");
							break;
						}
					
					case 3:
						titulo("ENVASAR GALLETAS");
						System.out.println("Cuantas galletas deseas envasar?");
						int galletasAE = sc.nextInt();
						
						float totalG = galletasAE * robotron.coste;
						
						if(totalG > robotron.dinero) {
							System.out.println("Accion incompleta. No posees el dinero suficienta para hornear las galletas");
						}
						else if(galletasAE > robotron.galletasH) {
							System.out.println("Accion incompleta. No posees galletas horneadas suficientes");
						}else if((robotron.galletasH + galletasAE) > robotron.capacidad ) {
							System.out.println("Accion incompleta. Esta accion supera el limite de tu robot");
						}else {
							robotron.galletasH = robotron.galletasH - robotron.galletasEnvasadas;
							robotron.galletasEnvasadas = robotron.agregar(robotron.galletasEnvasadas, galletasAE);
							robotron.dinero = robotron.dinero - totalG;
							System.out.println("Accion realizada correctamente. Ahora tines " + robotron.galletasEnvasadas);
							System.out.println("- " + totalG + "€");
						}
						
					
					case 4:
						titulo("ALMACEN DE GALLETAS");
						
						System.out.println("Galletas crudas: " + robotron.galletasC);
						System.out.println("Galletas horneadas: " + robotron.galletasH);
						System.out.println("Galletas envasadas: " + robotron.galletasEnvasadas);
						break;
						
						
					case 5:
						titulo("VENDER GALLETAS ENVASADAS");
						System.out.println("¿Cuantas galletas deseas vender?");
						int vender = sc.nextInt();
						
						if(vender > robotron.galletasEnvasadas) {
							System.out.println("No posees suficientes galletas");
						}else {
							float totalV = robotron.vender(vender, robotron.precio);
							System.out.println("ACCIÓN REALIZADA CORRECTAMENTE. HAS VENDIDO " + vender + " GALLETAS ENVASADAS" );
							dinero = dinero + totalV;
							System.out.println("+ " + totalV);
						}
						
					case 6:
						break;
						
						
					}
				}
				break;
				
			case 2:
				System.out.println("=========================");
				System.out.println("    ROBOT BANCARIO       ");	 	
				System.out.println("=========================");
				System.out.println("1. Ingresar dinero");
				System.out.println("2. Revisar fondos");
				System.out.println("3. Atras");
				int opcionB = sc.nextInt();
				
				switch(opcionB) {
				
				case 1:
					titulo("INGRESAR DINERO");
					System.out.println("¿Cuánto dinero deseas ingresar?");
					float ingreso = sc.nextFloat();
					 robotron.dinero = robotron.agregarDouble(dinero, ingreso);
					break;
					
				case 2: 
					titulo("REVISAR FONDOS");
					System.out.println("En tu cuenta posees: " + robotron.dinero + "€");
					break;
					
				case 3:
					break;
					
				default:
					System.out.println("Opción incorrecta");
					break;
				}
				
				
				break;
			}
			
		}
		
	}
	
	
	public static void titulo(String texto) {
		System.out.println("==========================");
		System.out.println("  " + texto + "  ");
		System.out.println("==========================");
	}
	

	

}
