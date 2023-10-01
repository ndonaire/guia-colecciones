package edu.unlam.paradigmas.colecciones.ej04;

public class Main {

	public static void main(String[] args) {
		Libro hp1 = new Libro("8478884459","Harry Potter y la piedra filosofal","J.K. Rowling",1);
		Libro hp2 = new Libro("8422682214","Harry potter y la cámara secreta","J.K. Rowling",2);
		Libro hp3 = new Libro("8478885196","Harry Potter y el prisionero de Azkaban","J.K. Rowling",3);
		Libro hp4 = new Libro("8422690950","Harry Poter y el cáliz de fuego","J.K. Rowling",3 );
		Libro hp5 = new Libro("8478885196","Harry Potter y el prisionero de Azkaban","J.K. Rowling",3);
		
		StockLibros list = new StockLibros();
		
		//Agregar libros al stock
		
		list.registrarStockLibro(hp1);
		list.registrarStockLibro(hp2);
		list.registrarStockLibro(hp3);
		list.registrarStockLibro(hp4);
		list.registrarStockLibro(hp5);
		
		System.out.println(list.toString());
		
	}

}
