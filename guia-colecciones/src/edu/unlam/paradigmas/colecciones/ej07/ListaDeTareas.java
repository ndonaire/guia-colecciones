package edu.unlam.paradigmas.colecciones.ej07;

import java.util.Queue;
import java.util.LinkedList;

public class ListaDeTareas {
	
	Queue<Tarea> tareas = new LinkedList<>();

	public ListaDeTareas() {
		super();
	}
	
	public void agregarTarea(Tarea tarea) {
		this.tareas.offer(tarea);
	}
	
	public Tarea procesartarea() {
		return this.tareas.poll();
	}

	@Override
	public String toString() {
		return "ListaDeTareas [tareas=" + tareas + "]";
	}
	
}
