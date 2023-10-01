package edu.unlam.paradigmas.colecciones.ej01;

import java.util.ArrayList;
import java.util.List;

public class ListaPaquetes {
	
	List<Paquete> paquetes = new ArrayList<>();
		
	public ListaPaquetes() {
		super();
	}

	public void agregarPaquete(Paquete paquete) {
		this.paquetes.add(paquete);
	};
	
	public Paquete bucarPaquetePorNumSeg(int numSeg) {
		for(Paquete paquete: this.paquetes) {
			if(paquete.getNumeroSeguimiento() == numSeg) {
				return paquete;
			}
		}
		return null;
	}
	
	public void mostrarPaquetesQueSuperenPeso(double peso) {
		for(Paquete paquete: this.paquetes) {
			if(paquete.getPeso() > peso) {
				System.out.println(paquete.toString());				
			}
		}		
	}

	@Override
	public String toString() {
		return "ListaPaquetes [paquetes=" + paquetes + "]";
	}
	
	
}
