package coche;

import java.util.Scanner;

public class Coche {
	public int plazas;
	public String matricula;
	public int nruedas;
	public String modelo;
	public String marca;
	public double litros;
	
	public Coche(int plazas, String matricula, int nruedas, String modelo, String marca, double litros){
		this.plazas = plazas;
		this.matricula = matricula;
		this.nruedas = nruedas;
		this.modelo = modelo;
		this.marca = marca;
		this.litros = litros;
	}
	
	public String pitar() {
		return("Este coche hace: PEE PEE :O");
	}
	
	public double moverse(double litros, double litrosrm) {
		
		double kmTotal = litrosrm*0.05;
		return litros - kmTotal;
	}
	
	
	
	
	
	public double repostar(double ltros, double arepostar) {
		return litros + arepostar;
	}
}
