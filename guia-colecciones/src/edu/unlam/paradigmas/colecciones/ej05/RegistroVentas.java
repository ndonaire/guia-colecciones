package edu.unlam.paradigmas.colecciones.ej05;

import java.util.HashMap;
import java.util.Map;

public class RegistroVentas {
	Map <Integer,Double> ventas = new HashMap<>();

	public RegistroVentas() {
		super();
	}
	
	public void registrarVenta(Venta venta) {
		this.ventas.put(venta.getMesFecha(),venta.getMontoVenta());
	}
		
	public Double mostrarVentasMes(int mes) {
		return ventas.get(mes);
	}

	@Override
	public String toString() {
		return "RegistroVentas [ventas=" + ventas + "]";
	}
	
}
