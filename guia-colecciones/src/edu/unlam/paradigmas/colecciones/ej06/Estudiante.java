package edu.unlam.paradigmas.colecciones.ej06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Estudiante {

	String apellido;
	List<Integer> notas = new ArrayList<>();
	
	public Estudiante(String apellido, int[] notas) {
		super();
		this.apellido = apellido;
		for (int intValue : notas) {
            this.notas.add(intValue);
        }
	}

	public String getApellido() {
		return apellido;
	}

	public List<Integer> getNotas() {
		return notas;
	}
	
	
	@Override
	public String toString() {
		return "Estudiante [apellido=" + apellido + ", notas=" + notas + "]";
	}

}
