package edu.unlam.paradigmas.colecciones.ej06;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class RegistroPorApellido {
	
	Map <String,List<Integer>> registroNotas = new HashMap<>();

	public RegistroPorApellido() {
		super();
	}
	
	public void agregarEstudiante (Estudiante estudiante) {
		this.registroNotas.put(estudiante.getApellido(), estudiante.getNotas());
	}
	
	public void agregarNota (String apellido, int nota) {
		List<Integer> notasAct = this.registroNotas.get(apellido);
		notasAct.add(nota);
		this.registroNotas.put(apellido, notasAct);		
	}
	
	public double mostrarPromedioAlumno(String apellido) {
		List<Integer> notasAct = this.registroNotas.get(apellido);
		return notasAct.stream().mapToInt(a -> a)
                .average().orElse(0);
	}

	@Override
	public String toString() {
		return "RegistroEstudiantes [registroNotas=" + registroNotas + "]";
	}
	
}
