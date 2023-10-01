package edu.unlam.paradigmas.colecciones.ej02;

import java.sql.Time;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Venta vta1 = new Venta(1,LocalDate.of(2023, 1, 1), Time.valueOf("14:30:00"), "Beto Velez", 234.56);
		Venta vta2 = new Venta(2,LocalDate.of(2023, 1, 1), Time.valueOf("15:30:00"), "Tito Puente", 654.6);
		Venta vta3 = new Venta(3,LocalDate.of(2023, 1, 4), Time.valueOf("17:30:00"), "Max Power", 45.5);
		Venta vta4 = new Venta(4,LocalDate.of(2023, 1, 1), Time.valueOf("16:30:00"), "Pechugas Larú", 323.9);
		Venta vta5 = new Venta(5,LocalDate.of(2023, 1, 5), Time.valueOf("18:30:00"), "Bubi Curvas", 545);
		
		ListaVentas list = new ListaVentas();
		
		// Agregar ventas a la lista
		
		list.agregarVenta(vta1);
		list.agregarVenta(vta2);
		list.agregarVenta(vta3);
		list.agregarVenta(vta4);
		list.agregarVenta(vta5);
		
		System.out.println(list.toString());
		
		// Buscar venta por número de venta
		System.out.println("Buscar venta nro 4: ");
		System.out.println(list.buscarVentaPorNumVta(4));
		
		//Mostrar venta de fecha: 
		
		LocalDate fechaBusq = LocalDate.of(2023, 1, 1);
		System.out.println("Buscar ventas de fecha: "+ fechaBusq);
				
		list.mostrarVentasDeDia(fechaBusq);
		
	}

}
