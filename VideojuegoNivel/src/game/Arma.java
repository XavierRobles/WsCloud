package game;



public class Arma {

	private int dañoMinimo;
	private int dañomaximo;

	public int usar() {
		
		int aleatorio = Util.generadornumeros(dañoMinimo, dañomaximo);
		return aleatorio;

	}

	public int getDañoMinimo() {
		return dañoMinimo;
	}

	public void setDañoMinimo(int dañoMinimo) {
		this.dañoMinimo = dañoMinimo;
	}

	public int getDañomaximo() {
		return dañomaximo;
	}

	public void setDañomaximo(int dañomaximo) {
		this.dañomaximo = dañomaximo;
	}

}
