	package POO;

public class Kia extends Mazda{
	static String modelo = "X";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mazda mx = new Mazda();
		System.out.println("EL modelo es :"+modelo);
		System.out.println("La marca es: "+mx.nombre);
		System.out.println("El comportamiento es:");
		mx.run();
	}

}
	