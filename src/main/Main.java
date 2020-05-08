package main;

import grafoNoDirigido.MiGrafo;

public class Main {

	public static void main(String[] args) {

		MiGrafo<String, String> grafo = new MiGrafo<String, String>(3);
		grafo.addVertex("a", "info a");
		grafo.addVertex("b", "info b");
		grafo.addVertex("c", "info c");

		grafo.addEdge("a", "c", 10);
		
		System.out.println("Info vertex a: " + grafo.getInfoVertex("a"));
		System.out.println("Info vertex b: " + grafo.getInfoVertex("b"));
		System.out.println("Info vertex c: " + grafo.getInfoVertex("c"));
		
		System.out.println("----");
		
		System.out.println("Adjacentes de a: " + grafo.adj("a"));
		System.out.println("Adjacentes de b: " + grafo.adj("b"));
		System.out.println("Adjacentes de c: " + grafo.adj("c"));
		
		System.out.println("----");
		
		System.out.println("CC de a: " + grafo.getCC("a"));
		System.out.println("CC de b: " + grafo.getCC("b"));
		System.out.println("CC de c: " + grafo.getCC("c"));

		
	}

}
