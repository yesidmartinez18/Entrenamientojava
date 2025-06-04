package POO;

public class HijaSuma extends Suma {

	public static void main(String[] args) {
		Suma ad = new Suma();
		ad.sumar(4, 5);
		ad.sumar(3, 3, 3);
		
		double d = ad.sumar(3.5, 2.3, 1.5);
		System.out.println(d);
	}

}
