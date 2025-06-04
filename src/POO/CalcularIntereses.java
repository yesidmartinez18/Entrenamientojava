package POO;

public class CalcularIntereses {

	public static void main(String[] args) {
		Davivienda dav = new Davivienda();
		Bancolombia ban = new Bancolombia();
		System.out.println("El interes de Davivienda es: "+dav.GetIntereses());
		System.out.println("EL interes de Bancolombia es: "+ban.GetIntereses());
	}

}
