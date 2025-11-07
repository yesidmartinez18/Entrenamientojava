package manejoexcepciones;

public class FinalyBlock {

	public static void main(String[] args) {
		Integer resultado = null;
		
		try {
			System.out.println("Intentando dividir....");
			resultado = 10/0;
			System.out.println("Resultado: "+resultado);
			
			//Guardar resultado
			System.out.println("Guardando resuktado en la base de datos");

		}catch(ArithmeticException e) {
			System.out.println("Error_ Division por 0");
			
		}finally {
			//Solo limpieza aqui
			System.out.println("Cerrando conexion a la base de datos");
		}

	}

}
