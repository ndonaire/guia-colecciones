package edu.unlam.paradigmas.colecciones.ej05;

import java.time.LocalDate;

public class Venta {
	LocalDate fecha;
	double monto;
	
	public Venta(LocalDate fecha, double monto) {
		super();
		this.fecha = fecha;
		this.monto = monto;
	}

	public double getMontoVenta() {
		return monto;
	}

	public int getMesFecha() {
		return fecha.getMonthValue();
	}

	@Override
	public String toString() {
		return "Venta [fecha=" + fecha + ", monto=" + monto + "]";
	}

}
