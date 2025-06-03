	package com.empresa;

public class PalabraClaveThis {

	
	int numeromatricula;
	String nombre;
	String grado;
	
	public PalabraClaveThis(int i, String n, String s) {
		numeromatricula = i;
		nombre = n;
		grado = s;		
	}
	
	public void display() {
		System.out.println("Numero matricula: "+numeromatricula+" nombre es: "+nombre+" Clase es:"+grado);
	}
	public static void main(String[] args) {
		
		PalabraClaveThis est = new PalabraClaveThis(10, "Juan", "segundo");
		est.display();
	}

}
