package edu.unlam.paradigmas.colecciones.ej02;

import java.sql.Time;
import java.time.LocalDate;

public class Venta {
	int numeroVenta;
	LocalDate fecha;
	Time hora; 
	String nombreCliente;
	double monto;
	
	public Venta(int numeroVenta, LocalDate fecha, Time hora, String nombreCliente, double monto) {
		super();
		this.numeroVenta = numeroVenta;
		this.fecha = fecha;
		this.hora = hora;
		this.nombreCliente = nombreCliente;
		this.monto = monto;
	}

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "Venta [numeroVenta=" + numeroVenta + ", fecha=" + fecha + ", hora=" + hora + ", nombreCliente="
				+ nombreCliente + ", monto=" + monto + "]";
	}
	
}
