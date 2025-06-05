package POO;

public class Mazda extends Carro{
	//static String nombre="Mazda"	;
	String nombre = "Mazda";
	public void GetNombre() {
		System.out.println(nombre);
		System.out.println(super.nombre);
	}
	public void run() {
		System.out.println("El Mazda esta transitando");
		super.run();
	}
	Mazda(){
		super();
		System.out.println("LLamando al constructor de mazda");
		
	}
		public static void main(String[]	args) {
		//	Carro car= new Carro();
			//System.out.println(nombre);
			//car.run();
			//Primer uso
			Mazda maz = new Mazda();
			maz.GetNombre();
			//Segundo uso
			maz.run();
		}
}
