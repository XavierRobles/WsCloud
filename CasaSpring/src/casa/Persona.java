package casa;


public class Persona {
	private String nombre, telefono;
	private int edad;
	
	private Direccion direccion;
	
	
	public Persona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	

	public Persona(String nombre, String telefono, Direccion direccion,  int edad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		this.direccion = direccion;

	}
	@Override
	public String toString() {
		return "Persona " + nombre + ", telefono=" + telefono + ", edad=" + edad + ", direccion=" + direccion
				+ "\n";
	}

	
	
}
