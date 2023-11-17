package ejercicio1;

import java.util.Scanner;

public class CuentaDeBanco {

	public static void main(String[] args) {
		String nombre;
		String nacimiento;
		String nCuenta;
		String movimientos;
		String opcionI;
		String logI = "";
		String logG = "";
		String concepto;
		String vacio;
		
		int opcion = 0;
		int opcionM;
		int saldo = 0;

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4  = new Scanner(System.in);
		
		System.out.println("REGISTRO DE CUENTA");
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("Fecha de nacimiento: ");
		nacimiento = sc.nextLine();
		System.out.println("Numero de cuenta: ");
		nCuenta = sc.nextLine();
		System.out.println();
		
		while(opcion != 7) {
			System.out.println("===========================");
			System.out.println("CUENTA BANCARIA DE " + nombre.toUpperCase());
			System.out.println("===========================");
			System.out.println("1. Datos de cuenta");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Equivalencias");
			System.out.println("5. Ingresos");
			System.out.println("6. Gastos");
			System.out.println("7. Salir");
			System.out.println();
			System.out.println("¿Qué operación deseas realizar? ");
			opcion = sc.nextInt();
			System.out.println();
			
			switch(opcion) {
			case 1:
				System.out.println("DATOS DE CUENTA");
				System.out.println("Nombre: " + nombre);
				System.out.println("Fecha de nacimiento: " + nacimiento);
				System.out.println("Numero de cuenta: " + nCuenta);
				System.out.println("Saldo actual: " + saldo + "€");
				System.out.println();
				System.out.println("Enter para continuar>>");
				vacio = sc3.nextLine();
				
				break;
				
				
			case 2:
				System.out.println("INGRESAR DINERO");
				
				int ingreso;
				String ingresos;
				
				System.out.println("Cuanto deseas ingresar: ");
				ingreso = sc.nextInt();
				
				if(ingreso <= 0) {
					System.out.println("Cantidad incorrecta");
					break;
				}else {
					System.out.println("Concepto: ");
					concepto = sc2.nextLine();
					
					saldo = saldo + ingreso;
					ingresos = ("+" + ingreso + "€");
					logI += (ingresos + "    " + concepto + "\n");
					
					movimientos = ("+" + ingreso + "€");
					System.out.println();
					System.out.println(movimientos);
					System.out.println("Enter para continuar>>");
					vacio = sc3.nextLine();
					break;
				}
				
				
				
				
			case 3: 
				System.out.println("RETIRAR DINERO");
				
				int gasto;
				String gastos;
				
				System.out.println("Cuanto deseas retirar: ");
				gasto = sc.nextInt();
				
				
				if(gasto <= 0) {
					System.out.println("Cantidad incorrecta");
					break;
				} else {
					System.out.println("Concepto: ");
					concepto = sc2.nextLine();
					
					if(saldo < gasto) {
						int opcg;
						System.out.println("No posees el saldo suficiente :( \nDeseas continuar?\n1.Si\n2.No");
						opcg = sc3.nextInt();
						
						
						if(opcg == 1) {
							saldo = saldo - gasto;
							gastos = ("-" + gasto + "€");
							logG += (gastos + "    " + concepto + "\n");
							 String movimientog = ("-" + gasto + "€");
							 System.out.println("Enter para continuar>>");
							 System.out.println(movimientog);
							 vacio = sc2.nextLine();
						} else if (opcg == 2) {
							System.out.println("De acuerdo, operación cancelada");
							System.out.println("Enter para continuar>>");
							vacio = sc2.nextLine();
						}
						System.out.println();
						break;
					}else {
						saldo = saldo - gasto;
						gastos = ("-" + gasto + "€");
						logG += (gastos + "    " + concepto + "\n");
						
						System.out.println(gastos);
						System.out.println("Enter para continuar>>");
						vacio = sc3.nextLine();
						System.out.println();
						break;
					}
					
				}
				
				
				
				
			case 4:
				System.out.println("EQUIVALENCIAS");
				System.out.println("1. Dolares estadounidenses");
				System.out.println("2. Libras esterlinas");
				System.out.println("3. Yuanes chinos");
				System.out.println("Elije la moneda que quieres ver: ");
				opcionM = sc.nextInt();
				
				switch(opcionM) {
				case 1:
					System.out.println("Saldo: " + (saldo * 0.95) + "$");
					System.out.println("Enter para continuar>>");
					vacio = sc3.nextLine();
					break;
					
				case 2: 
					System.out.println("Saldo " + (saldo * 1.15) + "£" );
					System.out.println("Enter para continuar>>");
					vacio = sc3.nextLine();
					break;
				
				case 3:
					System.out.println("Saldo " + (saldo * 0.13) + "¥");
					System.out.println("Enter para continuar>>");
					vacio = sc3.nextLine();
					break;
				}
				
				break;
				
				
			case 5:
				System.out.println("============");
				System.out.println("  INGRESOS  ");
				System.out.println("============");
				System.out.println(logI);
				System.out.println("Enter para continuar>>");
				vacio = sc4.nextLine();
				break;
				
				
			case 6:
				System.out.println("============");
				System.out.println("   GASTOS   ");
				System.out.println("============");
				System.out.println(logG);
				System.out.println("Enter para continuar>>");
				vacio = sc4.nextLine();
				break;
				
				
			case 7:
				break;
				    
				    
			   default:
				   System.out.println("Opción incorrecta");
			   
				
			}
		}

	}

}
