package POB;

public class Persona {
	public String nombre;
	public String apellido1;
	public String apellido2;
	public boolean casado;
    public int edad;
    public boolean vivo;


public Persona(String nombre, boolean casado, int edad, String apellido1, String apellido2, boolean vivo) {
	this.nombre = nombre;
	this.casado = casado;
	this.edad = edad;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.vivo = vivo;
 }

public Persona(String nombre, boolean casado, int edad) {
	this.nombre = nombre;
	this.casado = casado;
	this.edad = edad;
 }


public Persona(boolean casado, int edad, String apellido1, String apellido2, boolean vivo) {
	this.casado = casado;
	this.edad = edad;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
 }

public String getNombre() {
	return nombre + " " + apellido1 + " " + apellido2;
} 

public void matar(){
	if(vivo==true) {
		System.out.println("Has matado a " + nombre);
		vivo = false;
	}else {
		System.out.println("No puedes matar a un muerto");
	}
}

public void revivir() {
	if(vivo == false) {
		System.out.println("Has revivido a " + nombre);
	}else {
		System.out.println("No puedes revivir a un vivo");
	}
}

}



