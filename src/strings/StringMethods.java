package strings;

public class StringMethods {

	public static void main(String[] args) {
		String saludo = "Hola Mundo";
		System.out.println(saludo.charAt(3));
		System.out.println("Longitud:"+ saludo.length());
		System.out.println("En mayuscula:"+ saludo.toUpperCase());
		System.out.println("¿Contiene 'Mun'? "+saludo.contains("Mun"));
		System.out.println("Remplazo: "+saludo.replace("Mundo","cuatro"));
		System.out.println(saludo.concat(" Bello"));
		System.out.println("Termina en 'Hola'? "+saludo.endsWith("Hol"));

	}

}
