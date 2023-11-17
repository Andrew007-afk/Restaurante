package robotClase;

public class Robot {
	public int galletasC;
	public int galletasH;
	public int capacidad;
	public int galletasEnvasadas;
	public float dinero;
	public float coste;
	public float precio;
	
	public Robot(int galletasC, int galletasH, int capacidad, int galletasEnvasadas, float dinero, float coste, float precio) {
		this.galletasC = galletasC;
		this.galletasH = galletasH;
		this.capacidad = capacidad;
		this.galletasEnvasadas = galletasEnvasadas;
		this.dinero = dinero; 
		this.coste = coste;
		this.precio = precio;
	}
	
	public int agregar(int galletas, int galletasPlus) {
		int total = galletas + galletasPlus;
		return total;
	}
	
	public float agregarDouble(float suma, float sumando) {
		float total = suma + sumando;
		return total;
	}
	
	public float vender(int galletas, float precio) {
		float vendido = galletas * precio;
		return vendido;
	}
	
	
}
	
	
	
	
