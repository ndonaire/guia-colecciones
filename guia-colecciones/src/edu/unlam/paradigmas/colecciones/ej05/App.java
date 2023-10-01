package edu.unlam.paradigmas.colecciones.ej05;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Venta vta1 = new Venta(LocalDate.of(2023, 1, 1), 324.6);
		Venta vta2 = new Venta(LocalDate.of(2023, 2, 2), 5656.65);
		Venta vta3 = new Venta(LocalDate.of(2023, 3, 3), 7878.5);
		Venta vta4 = new Venta(LocalDate.of(2023, 4, 4), 212.75);
		Venta vta5 = new Venta(LocalDate.of(2023, 5, 5), 44.8);
		
		RegistroVentas vtas = new RegistroVentas();
		
		// Registrar ventas
		
		vtas.registrarVenta(vta1);
		vtas.registrarVenta(vta2);
		vtas.registrarVenta(vta3);
		vtas.registrarVenta(vta4);
		vtas.registrarVenta(vta5);
		
		System.out.println(vtas.toString());
		//Mostrar ventas de mes
		
		System.out.println("Mostrar ventas de mes 3:");
		System.out.println(vtas.mostrarVentasMes(3));
	}

}
