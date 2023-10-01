package edu.unlam.paradigmas.colecciones.ej07;

public class Tarea {
	int idTarea;
	String descripcion;
	
	public Tarea(int idTarea, String descripcion) {
		super();
		this.idTarea = idTarea;
		this.descripcion = descripcion;
	}

	public int getIdTarea() {
		return idTarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", descripcion=" + descripcion + "]";
	}
	
}
