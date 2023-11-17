package Ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		int año;
		int dia;
		String mesl = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el día: ");
		dia = sc.nextInt();
		
		
		System.out.println("Dime el mes: ");
		mes = sc.nextInt();
		
		switch(mes) {
		case 1:
			mesl = "Enero";
			break;
			
		case 2:
			mesl = "Febrero";
			break;
			
		case 3:
			mesl = "Marzo";
			break;
			
		case 4:
			mesl = "Abril";
			break;
			
		case 5:
			mesl = "Mayo";
			break;
			
		case 6:
			mesl = "Junio";
			break;
			
		case 7:
			mesl = "Julio";
			break;
			
		case 8:
			mesl = "Agosto";
			break;
			
		case 9:
			mesl = "Septiembre";
			break;
			
		case 10:
			mesl = "Octubre";
			break;
			
		case 11:
			mesl = "Noviembre";
			break;
			
		case 12:
			mesl = "Diciembre";
			break;
		}
		
		
		
		System.out.println("Dime el año: ");
		año = sc.nextInt();
		
		System.out.println("Tu cumpleaños es el " + dia + " de " + mesl + " del " + año);
		

	}

}
