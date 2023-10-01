package edu.unlam.paradigmas.colecciones.ej04;

import java.util.HashSet;
import java.util.Set;

public class StockLibros {
	Set<Libro> stockLibros = new HashSet<>();

	public StockLibros() {
		super();
	}
	
	public void registrarStockLibro(Libro libro) {
		this.stockLibros.add(libro);
	}

	@Override
	public String toString() {
		return "StockLibros [stockLibros=" + stockLibros + "]";
	}
	
}
