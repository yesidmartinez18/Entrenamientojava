package Arreglo;

public class PasarArregloAMetodo {
	
	///Pasar arreglo a metodo
	public static void Encontrar(int arreglotres[]) {
	
		int min = arreglotres[0];
		for (int i = 0; i<arreglotres.length; i++) {
			if(min>arreglotres[i]) {
				min=arreglotres[i];
				System.out.println("El arreglo menor:"+min );
			}
			
		}
		
	}
	
	public static int[] getArrego(){
		return new int[] {2,4,6,12,14} ;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
