package casa;

public class Direccion {
	private String tipoVia,calle,numero;
	int cp;

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public Direccion() {
		super();
	}

	public Direccion(String tipoVia, String calle, String numero, int cp) {
		super();
		this.tipoVia = tipoVia;
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Direccion " + tipoVia + ", calle=" + calle + ", numero=" + numero + ", cp=" + cp + "\n";
	}


	
	
	
	
}
