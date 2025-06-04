package POO;

public class Suma {
	public void sumar(int a, int b) {
		int c = a +b;	
		System.out.println("La suma es: "+c)	;
	}
	public void sumar(int a, int b, int c) {
			int d = a+b+c;
			System.out.println("La suma es "+d);
	}
	
	public double sumar(double a, double b, double c) {
		double d = a+b;
		return d;
	}
}
