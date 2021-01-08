package entidad;

public class Salario {
private int base;
private String tipo;
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
@Override
public String toString() {
	return "Salario [base=" + base + ", tipo=" + tipo + "]";
}
	
	
}
