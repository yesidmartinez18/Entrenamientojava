package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
			String modulo  = "Contabilidad";
			switch(modulo) {
			case "Contabilidad": 	
				System.out.println("Ingreso al modulo de contabilidad");
				break;
			case "Tesoreria":
				System.out.println("Ingreso al modulo de tesoreria");	
				break;
			case "Nomina": 
				System.out.println("Ingreso al modulo de nomina");
				break;
			case "Inventarios":
				System.out.println("Ingreso al modulo de Inventarios");
				break;
			case "Tndycon":
				System.out.println("Ingreso al modulo de Indicom");
				break;
			case "Predial":
				System.out.println("Ingreso al modulo de Predial	");
				break;
			case "Ejemplo":
				System.out.println("Ingreso al modulo de Ejemplo");	
				break;
			default:
				System.out.println("Ni monda");
				
			}	
	}

}
