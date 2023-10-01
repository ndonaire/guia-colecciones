package edu.unlam.paradigmas.colecciones.ej10;

import java.util.Stack;

public class Terminal {
	
	Stack<String> comandos = new Stack<String>();

	public Terminal() {
		super();
	}

	public void ejecutarComandos(String comando) {
		System.out.println("Ejecutando comando: " + comando);

		comandos.push(comando);
	}
	
	public void deshacerComandoAnterior() {
		String comando;
		if(!comandos.isEmpty()) {
			comando = comandos.pop();
			System.out.println("Deshacer comando: " + comando);
		}
		else
			System.out.println("No se ejecutó ningun comando");
	}

}
