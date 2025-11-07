package manejoexcepciones;

import java.io.FileReader;
import java.io.IOException;

public class EjemploMultiCatch {

	public static void main(String[] args) {
		try {
			int resultado = 10/0; //Esto lanza una AritmethicException
			FileReader file = new FileReader("archivo.txt");
		}catch (ArithmeticException | IOException e){
			System.out.println("!Ocurrio una exception");
			System.out.println(e.getClass().getSimpleName());
		}

	}

}
