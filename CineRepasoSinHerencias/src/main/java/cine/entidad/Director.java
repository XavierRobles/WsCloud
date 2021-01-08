package cine.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Director {
	private int id;
	protected String nombre;
	private int edad;
	private String fechaDeNacimiento;
	
	
	public Director() {
		super();
	}
	public Director(int id, String nombre, int edad, String fechaDeNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaDeNacimiento = fechaDeNacimiento;
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
