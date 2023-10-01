package edu.unlam.paradigmas.colecciones.ej08;

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
	
	public void invertirCola(Queue<Tarea> cola) {
		if (tareas.isEmpty()) {
            return;
        }
        
        Tarea elemento = tareas.poll();
        invertirCola(tareas); //la hago recursiva para que invierta todos
        tareas.offer(elemento);
	}

	@Override
	public String toString() {
		return "ListaDeTareas [tareas=" + tareas + "]";
	}
	
}
