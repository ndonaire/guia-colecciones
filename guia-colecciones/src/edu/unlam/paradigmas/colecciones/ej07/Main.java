package edu.unlam.paradigmas.colecciones.ej07;

public class Main {

	public static void main(String[] args) {
		ListaDeTareas tareas = new ListaDeTareas();
		
		//Llegan tareas 
		Tarea tarea1 = new Tarea(1,"Limpiar");
		tareas.agregarTarea(tarea1);
		Tarea tarea2 = new Tarea(2,"Barrer");
		tareas.agregarTarea(tarea2);
		Tarea tarea3 = new Tarea(3,"Cocinar");
		tareas.agregarTarea(tarea3);
		
		System.out.println(tareas);
		
		//Procesar tareas
		tareas.procesartarea();
		System.out.println(tareas);
		tareas.procesartarea();
		System.out.println(tareas);
		tareas.procesartarea();
		System.out.println(tareas);
		
		
		
	}

}
