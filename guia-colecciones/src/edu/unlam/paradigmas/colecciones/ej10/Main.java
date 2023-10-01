package edu.unlam.paradigmas.colecciones.ej10;

public class Main {

	public static void main(String[] args) {
		Terminal programa = new Terminal();
		
		programa.ejecutarComandos("Imprimir en Pantalla");
		programa.ejecutarComandos("Borrar Archivo");
		programa.ejecutarComandos("Cerrar Programa");
		programa.ejecutarComandos("Matar a Flanders");
		
		programa.deshacerComandoAnterior();
		
	}

}
