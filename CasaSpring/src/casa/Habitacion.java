package casa;

public class Habitacion {
private String tipoHabitacion;
private double metros;
public Habitacion(String tipoHabitacion, double metros) {
	super();
	this.tipoHabitacion = tipoHabitacion;
	this.metros = metros;
}

public String getTipoHabitacion() {
	return tipoHabitacion;
}

public void setTipoHabitacion(String tipoHabitacion) {
	this.tipoHabitacion = tipoHabitacion;
}

public double getMetros() {
	return metros;
}

public void setMetros(double metros) {
	this.metros = metros;
}

public Habitacion() {
	super();
}

@Override
public String toString() {
	return "Habitacion " + tipoHabitacion + ", metros=" + metros + "\n";
}




}
