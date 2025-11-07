package javacollection;

import java.util.*;

public class ColeccionesJava {

	public static void main(String[] args) {
		//------------------LISTa dinamica------------------
		System.out.println("=================LIST=====================");
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Uno");
		arrayList.add("Dos");
		arrayList.add("Tres");
		arrayList.remove("Tres");
		arrayList.set(1, "Cuatro");
		System.out.println("ArrayList: "+ arrayList);
		
		
		//linkedlist lista doblemente enlazada
		List<String> LinkedList = new LinkedList<>();
		LinkedList.add("Uno");
		LinkedList.add("Dos");
		LinkedList.add("Tres");
		
		LinkedList.remove(1);
		LinkedList.remove("Uno");
		System.out.println("LinkedList: "+LinkedList);
		
		
		//------------------SET------------------
		
		//No mantiene ordem, no permite duplicados //calcula su hashcode
													//Usa ese hash lo usa para determinar en que casilla coloca el elemento
		System.out.println("=================SET=====================");
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Manzana");
		hashSet.add("Pera");
		hashSet.add("Banano");
		hashSet.add("Nuez");
		hashSet.add("Manzana");
		
		System.out.println("HashSet: "+hashSet);
		
		//TreeSet Mantiene Orden Natural //Arbol binaro bakanceado. Ordena segun un comparador
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Manzana");
		treeSet.add("Banano");
		treeSet.add("Naranja");
		treeSet.add("Manzana");
		treeSet.add("Aguacate");
		treeSet.add("Uva");
		treeSet.remove("Uva");
		
		
		System.out.println("treeSet: "+treeSet);
		
		//Mantiene orden de insercion; Lisya doblemente enlazada
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Manzana");
		linkedHashSet.add("Banano");
		linkedHashSet.add("Naranja");
		linkedHashSet.add("Pera");
		linkedHashSet.add("Uva");
		
		System.out.println("linkedHashSet: "+linkedHashSet);
		
		
		System.out.println("=================QuEUE=====================");
		//Orden natural // ordena por elemento minimo por defecto
		
		Queue<Integer> priorityQueue = new PriorityQueue<Integer>() ;
		
		priorityQueue.add(39);
		priorityQueue.add(20);
		priorityQueue.add(28);
		priorityQueue.add(2);
		priorityQueue.add(34);
		priorityQueue.add(14);
		priorityQueue.add(7);
		
		System.out.println("priorityQueue" +priorityQueue);
		
		
		//
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Frente");
		arrayDeque.addLast("Final");
		arrayDeque.addFirst("Inici0");
		
		System.out.println("ArrayDque: "+arrayDeque);
		
		
		//SIn orden garantizado
		
		System.out.println("=================MAP=====================");
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Tres");
		hashMap.put(2, "Dos");
		hashMap.put(1, "Uno");
		System.out.println("hasmap: "+hashMap);
		
		
		//Treemap: Ordena por clave
		Map<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "Tres");
		treeMap.put(1, "Uno");
		treeMap.put(4, "CUatro");
		treeMap.put(6, "seis");
		
		System.out.println("treemap: "+treeMap);
		
		//LinkedhashMap: Mantiene orden de insercion
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "Tres");
		linkedHashMap.put(1, "Uno");
		linkedHashMap.put(4, "CUatro");
		linkedHashMap.put(6, "seis");
		

		System.out.println("Linedhashmap: "+linkedHashMap);
		
		
		
		
		
	}

}
