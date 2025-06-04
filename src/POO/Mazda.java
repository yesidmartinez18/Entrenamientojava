package POO;

public class Mazda extends Carro{
	static String nombre="Mazda"	;
	
		public static void main(String[]	args) {
			Carro car= new Carro();
			System.out.println(nombre);
			car.run();
		}
}
