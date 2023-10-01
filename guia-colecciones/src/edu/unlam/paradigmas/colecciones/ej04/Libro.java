package edu.unlam.paradigmas.colecciones.ej04;

public class Libro {
	String  ISBN;
	String titulo;
	String autor;
	int ejemplar;

	public Libro(String iSBN, String titulo, String autor, int ejemplar) {
		super();
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplar = ejemplar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Libro otroLibro = (Libro) obj;
		return ISBN.equals(otroLibro.ISBN) && ejemplar == otroLibro.ejemplar && titulo.equals(otroLibro.titulo)
				&& autor.equals(otroLibro.autor);
	}

	@Override
	public int hashCode() {
		int resultado = ISBN.hashCode();
		resultado = 31 * resultado + titulo.hashCode();
		resultado = 31 * resultado + autor.hashCode();
		resultado = 31 * resultado + ejemplar;
		return resultado;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", ejemplar=" + ejemplar + "]";
	}
	
}
