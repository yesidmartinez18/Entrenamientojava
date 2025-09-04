package POO;

public class ClaseDeIngenieria implements Estudiante{
	
	public void mostrarNombre() {
	System.out.println("Hola, somos estudiantes de ingenieria");
		
	}

	
	public void obtenerNumeroDeEstudiantes() {
		System.out.println("Somos 50 estudiantes");
		
	}


	public void obtenerGrado() {
		System.out.println("Somos de Quinto semestre");
		
	}
	
	public void obtenerUniversidad() {
		System.out.println("La Universidad es:"+ Estudiante.universidad);
	}


	public static void main(String[] args) {
		
		ClaseDeIngenieria ing = new ClaseDeIngenieria();
		ClaseDeMedicina med = new ClaseDeMedicina();
		
		ing.mostrarNombre();
		ing.obtenerGrado();
		ing.obtenerNumeroDeEstudiantes();
		ing.obtenerUniversidad();
		System.out.println("**************************************/n");
		med.mostrarNombre();
		med.obtenerGrado();
		med.obtenerNumeroDeEstudiantes();
		med.obtenerUniversidad();

	}


	
	public void obtenerNombreInterface() {
		
		
	}

	

}
