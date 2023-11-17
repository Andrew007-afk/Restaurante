package principal;

import POB.Persona;

public class Main {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Pepe", true, 34);
		Persona persona2 = new Persona("Andrew", false, 19, "Pillajo", "Cocha", true);
		/*
		if(persona2.nombre == null) {
			System.out.println("Error.Nombre no encontrado");
			System.out.println();
			System.out.println("Nombre: Anónimo");
			System.out.println("Casado: " + persona2.casado);
			System.out.println("Edad: " + persona2.edad);
			System.out.println("Primer apellido: " + persona2.apellido1);
			System.out.println("Segundo apellido: " + persona2.apellido2);
		}else {
			
			System.out.println("Nombre: " + persona2.nombre);
			System.out.println("Casado: " + persona2.casado);
			System.out.println("Edad: " + persona2.edad);
			System.out.println("Primer apellido: " + persona2.apellido1);
			System.out.println("Segundo apellido: " + persona2.apellido2);
		}*/
		
		System.out.println(persona2.getNombre());
		persona2.matar();
		
		
		
		
		
	}




}
