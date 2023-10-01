package edu.unlam.paradigmas.colecciones.ej01;

public class App {

	public static void main(String[] args) {
		Paquete paq1 = new Paquete(1, "Calle Falsa 123", "Calle Falsa 321", 135.58);
		Paquete paq2 = new Paquete(2, "Calle Falsa 123", "Calle Falsa 321", 24.67);
		Paquete paq3 = new Paquete(3, "Calle Falsa 123", "Calle Falsa 321", 335.5);
		Paquete paq4 = new Paquete(4, "Calle Falsa 123", "Calle Falsa 321", 198.5);
		Paquete paq5 = new Paquete(4, "Calle Falsa 123", "Calle Falsa 321", 98.5);
		
		ListaPaquetes list = new ListaPaquetes();
		
		//Agregar Paquetes
		
		list.agregarPaquete(paq1);
		list.agregarPaquete(paq2);
		list.agregarPaquete(paq3);
		list.agregarPaquete(paq4);
		list.agregarPaquete(paq5);
		
		System.out.println(list.toString());
		
		//Buscar paquete por número de seguimiento
		
		System.out.println("Buscar paquete Num. Seg. 2: ");
		System.out.println(list.bucarPaquetePorNumSeg(2));
		
		//Mostrar paquetes que superen un peso en específico
		
		System.out.println("Mostrar paquetes que superen los 150 kg");
		list.mostrarPaquetesQueSuperenPeso(150);
		
	}

}
