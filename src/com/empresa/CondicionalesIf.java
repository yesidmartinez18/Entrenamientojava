package com.empresa;

public class CondicionalesIf {

	public static void main(String[] args) {
		String var1 = "Hola";
		String var2 = "Equipo";
		
		int a = 300;
		int b = 200;
		//Primer tipo
		/*if(a>1000) {
			System.out.println("A es mayor que 1000");
		}
			*/
		//Segundo tipo 
		/*if(a<1000) {
			System.out.println("A es menor que 1000");
		}else {
			System.out.println("A es mayor que 1000");
		}*/
	//Tercer tipo
		if(a == 100) {
			System.out.println("A = 100");
			
		}else if(a==200) {
			System.out.println("A es 200");
		}else if(a==300) {
			System.out.println("A es 300");
		}else {
			System.out.println("A no es igual a ninguno de los numeros");
		}
	}
}
