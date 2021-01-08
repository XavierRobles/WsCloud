package game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Guerrero extends Personaje {
	
	private int fuerza;
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		int dañoTotal;
		if (this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			dañoTotal = getNivel() + fuerza;

		} else {
			dañoTotal = getArma().usar();
		}

		dañoTotal += getArma().usar() * 2;
		System.out.println("Guerrero hace " + dañoTotal);
		p.setSalud(p.getSalud() - dañoTotal);
	}

}
