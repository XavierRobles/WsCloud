package cine.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Peliculas {
	private int id;
	@Autowired
	@Qualifier("director1")
	private Director director;
	
	
	private Actor actor;
	public int getId() {
		return id;
	}
	
	
	
	
	public Peliculas() {
		super();
	}




	public Peliculas(int id, Director director, Actor actor) {
		super();
		this.id = id;
		this.director = director;
		this.actor = actor;
	}




	public void setId(int id) {
		this.id = id;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", director=" + director + ", actor=" + actor + "]";
	}
	
	
	
	
}
