package edu.unlam.paradigmas.colecciones.ej03;

import java.util.HashSet;
import java.util.Set;

public class ListadoPalabras {
	Set<String> palabrasUnicas = new HashSet<>();

	public ListadoPalabras() {
		super();
	}
	
	public void almacenarPalabra (String palabra) {
		this.palabrasUnicas.add(palabra);
	}

	@Override
	public String toString() {
		return "ListadoPalabras [palabrasUnicas=" + palabrasUnicas + "]";
	}

}
