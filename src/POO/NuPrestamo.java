package POO;

public class NuPrestamo extends BancoPrestamo{

	public static void main(String[] args) {
		NuPrestamo prestamo = new NuPrestamo();
		prestamo.setEdad(8);
		prestamo.setNombre("Edwin");
		prestamo.setCantidad(39995);
		
		System.out.println("El nombre es: "+prestamo.getNombre());
		System.out.println("La edad es: "+prestamo.getEdad());
		System.out.println("La cantidad es:"+prestamo.getCantidad());

	}
	

}
