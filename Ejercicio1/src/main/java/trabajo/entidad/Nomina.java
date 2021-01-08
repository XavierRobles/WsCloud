package trabajo.entidad;

import org.springframework.stereotype.Component;

@Component
public class Nomina {
	private double salario;
	private String fecha;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Nomina [salario=" + salario + ", fecha=" + fecha + "]";
	}
	
	
}