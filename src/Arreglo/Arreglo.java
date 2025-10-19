package Arreglo;

public class Arreglo {

	public static void main(String[] args) {
		//Definicion del arreglo
		int Arreglouno[] = new int [10];
		//Definicion de los valores
		Arreglouno[0]=12;
		Arreglouno[1]=1;
		Arreglouno[2]=12;
		Arreglouno[3]=1;
		Arreglouno[4]=12;
		Arreglouno[5]=1;
		Arreglouno[6]=12;
		Arreglouno[7]=1;
		Arreglouno[8]=12;
		Arreglouno[9]=1;
		
		System.out.println(Arreglouno[2]);
		
		for(int i=0; i<Arreglouno.length;i++) {
			System.out.println(Arreglouno[i]);
		}
		
		int Arreglodos[]= {5,10,15,20,25,30,35,40};
		System.out.println("El tamaño del segundo arreglo es: "+Arreglodos.length);
		

	}

}
