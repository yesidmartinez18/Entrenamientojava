package com.empresa;

public class StaticClass {

	int i=0;
	static int j;
	public static void main(String[] args) {
		//System.out.println(StaticClass.i);	//i pertenece al objeto y no a la clase
		System.out.println(StaticClass.j);
		
		StaticClass a = new StaticClass();	
		System.out.println(a.i);
		int resultado = StaticClass.sumar(3,4);
		System.out.println(resultado);
	}

	public static int sumar(int a,int b) {
			return a+b;
	}
}
