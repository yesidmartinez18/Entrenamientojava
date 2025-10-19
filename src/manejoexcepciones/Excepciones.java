package manejoexcepciones;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		try {
			String texto = "Juan";
			System.out.println(texto.length());
		}catch (NullPointerException e) {
			System.out.println("Error : estas intentando acceder a un objeto nulo");
		}
		int numero = numero = pedirNumeroEntero();
		System.out.println("Numero ingresado correctamente: "+numero);

	}
	
	public static int pedirNumeroEntero() {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		boolean a = false;//amarillo
		
		     //rojo
		while(!a) {
			System.out.println("Ingrese un numero entero");
			String entrada = scanner.nextLine();
			try {
				numero = Integer.parseInt(entrada);
				a = true; //rojo
			}catch(NumberFormatException e) {
				System.out.println("Error : No ingresaste un numero valido");
			}
		}
		return numero;
		
		
		
	}

}
