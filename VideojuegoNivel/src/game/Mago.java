package game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mago extends Personaje {
	private int inteligencia;
	
	@Override
	public void atacar(Personaje p) {
		int dañoTotal;
		if (this.getArma() instanceof Hechizo) {
			dañoTotal = getNivel()+ inteligencia;

		} else {
			dañoTotal = getArma().usar();
		}

		dañoTotal += getArma().usar() * 2;
		System.out.println("Mago hace " + dañoTotal);
		p.setSalud(p.getSalud() - dañoTotal);
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

}
