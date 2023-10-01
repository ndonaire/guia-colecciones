package edu.unlam.paradigmas.colecciones.ej01;

public class Paquete {
	int numeroSeguimiento;
	String direccionOrigen;
	String direccionDestino;
	double peso;
	
	public Paquete(int numeroSeguimiento, String direccionOrigen, String direccionDestino, double peso) {
		super();
		this.numeroSeguimiento = numeroSeguimiento;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.peso = peso;
	}

	public int getNumeroSeguimiento() {
		return numeroSeguimiento;
	}
	
	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Paquete [numeroSeguimiento=" + numeroSeguimiento + ", direccionOrigen=" + direccionOrigen
				+ ", direccionDestino=" + direccionDestino + ", peso=" + peso + "]";
	}
	
}































