package deporte.entidad;

import java.util.List;



public class Equipo {

	private String nombre;
	private List<Jugador> jugadores;
	private String ciudad;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, List<Jugador> jugadores, String ciudad) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + ", ciudad=" + ciudad + "]";
	}

}
