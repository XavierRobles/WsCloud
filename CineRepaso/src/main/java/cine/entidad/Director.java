package cine.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Director extends Reparto {
	private int id;
	protected String nombre;
	private int edad;
	private String fechaDeNacimiento;


	public Director() {
		super();
		this.id = 1;
		this.nombre = "Xavi";
		this.edad = 38;
		this.fechaDeNacimiento = "28/05/1982";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fechaDeNacimiento="
				+ fechaDeNacimiento + "]";
	}

}
