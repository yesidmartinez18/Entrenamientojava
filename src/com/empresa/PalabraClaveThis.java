	package com.empresa;

public class PalabraClaveThis {

	
	int numeromatricula;
	String nombre;
	String grado;
	
	public PalabraClaveThis(int numeromatricula, String nombre, String grado) {
		this.numeromatricula = numeromatricula;
		this.nombre = nombre;
		this.grado = grado;		
	}
	
	public void display() {
		System.out.println("Numero matricula: "+numeromatricula+" nombre es: "+nombre+" Clase es:"+grado);
	}
	public static void main(String[] args) {
		
		PalabraClaveThis est = new PalabraClaveThis(10, "Juan", "segundo");
		est.display();
	}

}
