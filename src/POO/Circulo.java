package POO;

public class Circulo extends Formas {

	public static void main(String[] args) {
		
		Formas c= new Circulo();
		Formas r = new Rectangulo();
		Formas t = new Triangulo();
		
		c.MostrarForma();
		t.MostrarForma();
		r.MostrarForma();
		
	}

	@Override
	public void MostrarForma() {
		System.out.println("La forma es una circunferencia");
		
	}	

}
