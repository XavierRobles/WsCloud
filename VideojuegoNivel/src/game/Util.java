package game;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

public class Util {
	public static int generadornumeros(int rangoA, int rangoB) {

		int numero = ThreadLocalRandom.current().nextInt(rangoA, rangoB);
		return numero;

	}

}
