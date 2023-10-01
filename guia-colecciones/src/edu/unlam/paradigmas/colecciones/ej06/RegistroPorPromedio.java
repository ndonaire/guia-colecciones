package edu.unlam.paradigmas.colecciones.ej06;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class RegistroPorPromedio {

	Map <Double,List<String>> registroNotas = new HashMap<>();

	public RegistroPorPromedio() {
		super();
	}
	
	public void agregarEstudiante(Estudiante estudiante) {
		double promedio = estudiante.getNotas().stream().mapToInt(a -> a)
                .average().orElse(0);
		List<String> est = this.registroNotas.get(promedio);
		if(est == null)
			est = new ArrayList<>();
		est.add(estudiante.getApellido());
		
		this.registroNotas.put(promedio, est);
	}

	@Override
	public String toString() {
		return "RegistroPorPromedio [registroNotas=" + registroNotas + "]";
	}
	
}

