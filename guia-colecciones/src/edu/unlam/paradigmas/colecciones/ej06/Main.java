package edu.unlam.paradigmas.colecciones.ej06;

public class Main {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Simpson", new int[]{10,9,9,8,10});
		Estudiante est2 = new Estudiante("Bouvier", new int[]{10,9,9,8,10}); 
		Estudiante est3 = new Estudiante("Flanders", new int[]{4,4,4,4,4}); 
		Estudiante est4 = new Estudiante("Patiño", new int[]{4,6,7,8,7}); 
		Estudiante est5 = new Estudiante("Gorgory", new int[]{2,2,4,4,2}); 
		
		//Crear registro de notas de cada estudiante por Apellido
		RegistroPorApellido notas = new RegistroPorApellido();
		
		
		notas.agregarEstudiante(est1);
		notas.agregarEstudiante(est2);
		notas.agregarEstudiante(est3);
		notas.agregarEstudiante(est4);
		notas.agregarEstudiante(est5);
		System.out.println("Notas de alumnos: ");
		System.out.println(notas);
		
		//Agregar notas a alumnos
		System.out.println("Agregando notas a alumnos: ");
		notas.agregarNota("Patiño", 7);
		notas.agregarNota("Flanders", 10);
		notas.agregarNota("Gorgory", 3);
		System.out.println(notas);
		
		//Mostrar promedio de estudiante
		System.out.println("Mostrar promedio de Simpson: ");
		System.out.println(notas.mostrarPromedioAlumno("Simpson"));
		
		//Registrar estudiantes por promedio
		RegistroPorPromedio notas2 = new RegistroPorPromedio();
		notas2.agregarEstudiante(est1);
		notas2.agregarEstudiante(est2);
		notas2.agregarEstudiante(est3);
		notas2.agregarEstudiante(est4);
		notas2.agregarEstudiante(est5);
		
		System.out.println("Alumnos por promedio: ");
		System.out.println(notas2);
	}

}
