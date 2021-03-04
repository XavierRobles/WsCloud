package mvc.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
// Entity crea la tabla 
@Entity
//poner nombre a la tabla, por defecto coge el nombre de la clase
@Table(name = "pelis")
@Scope("prototype") // genera objetos fuera del contexto de sprin 
public class Pelicula {
	@Id
	// con el @id pone la primari key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // con esto le decimos que el valos sea automatico
	private int id;
	private String titulo;
	private String director;
	private int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", year=" + year + "]";
	}

	
}
