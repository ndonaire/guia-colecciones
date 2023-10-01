package edu.unlam.paradigmas.colecciones.ej09;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {

		Stack<String> pila = new Stack<String>();
		
		pila.add("(");
		pila.add("8");
		pila.add("+");
		pila.add("5");
		pila.add(")");
		
		
		System.out.println(esExpresionValida(pila));
	
	
	}
	
	public static boolean esExpresionValida (Stack<String> pila) {
		int parentIni = 0;
		int parentFin = 0;
		String caracter;
		
		while(!pila.isEmpty()) {
			caracter = pila.pop();
			if(caracter == "(")
				parentIni++;
			if(caracter == ")")
				parentFin++;
		}
		return (parentIni == parentFin);
		
	}

}
