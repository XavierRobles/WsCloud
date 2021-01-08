package casa;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Casa {
	private Direccion direccion;
	private ArrayList<Habitacion> habitaciones;
	private ArrayList<Persona> inquilinos;
	private ArrayList<Persona> propietarios;

	public Casa(Direccion direccion, Persona propietario, ArrayList<Persona> inquilino, Habitacion habitacion,
			ArrayList<Habitacion> habitaciones, ArrayList<Persona> inquilinos, ArrayList<Persona> propietarios) {
		super();
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.inquilinos = inquilinos;
		this.propietarios = propietarios;
	}

	
	
	public ArrayList<Persona> getInquilinos() {
		return inquilinos;
	}



	public void setInquilinos(ArrayList<Persona> inquilinos) {
		this.inquilinos = inquilinos;
	}



	public ArrayList<Persona> getPropietarios() {
		return propietarios;
	}



	public void setPropietarios(ArrayList<Persona> propietarios) {
		this.propietarios = propietarios;
	}



	public Casa() {
		super();
	}


	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}



	@Override
	public String toString() {
		return "Casa, " + direccion + ", habitaciones=" + habitaciones + ", inquilinos=" + inquilinos
				+ ", propietarios=" + propietarios + "\n";
	}






	

	}

	
		

