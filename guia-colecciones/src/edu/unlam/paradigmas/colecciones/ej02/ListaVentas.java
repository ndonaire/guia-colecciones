package edu.unlam.paradigmas.colecciones.ej02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
	List <Venta> ventas = new ArrayList<>();

	public ListaVentas() {
		super();
	}
	
	public void agregarVenta(Venta venta) {
		this.ventas.add(venta);
	}
	
	public Venta buscarVentaPorNumVta(int nroVenta) {
		for(Venta vtas : ventas) {
			if(vtas.getNumeroVenta() == nroVenta) {
				return vtas;
			}
		}
		return null;
	}
	
	public void mostrarVentasDeDia (LocalDate fecha) {
		for(Venta vtas : ventas) {
			if(vtas.getFecha().equals(fecha)) {
				System.out.println(vtas.toString());
			}
		}
	}

	@Override
	public String toString() {
		return "ListaVentas [ventas=" + ventas + "]";
	}
}
