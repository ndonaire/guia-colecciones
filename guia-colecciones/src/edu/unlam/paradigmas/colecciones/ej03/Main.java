package edu.unlam.paradigmas.colecciones.ej03;

public class Main {

	public static void main(String[] args) {
		
		ListadoPalabras list = new ListadoPalabras();
		
		//Almacenar palabras únicas
		
		list.almacenarPalabra("Estoy");
		list.almacenarPalabra("Almacenando");
		list.almacenarPalabra("Palabras");
		list.almacenarPalabra("Unicas");
		list.almacenarPalabra("Unicas");
		list.almacenarPalabra("Excepto");
		list.almacenarPalabra("Unicas");
		
		System.out.println("Mostrar listado de palabras únicas: ");
		System.out.println(list.toString());
		
	}

}
