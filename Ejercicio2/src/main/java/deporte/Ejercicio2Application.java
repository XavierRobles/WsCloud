package deporte;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import deporte.entidad.Jugador;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Ejercicio2Application {
	public static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(Ejercicio2Application.class, args);
		Jugador j1 = context.getBean("jugador1", Jugador.class);
		Jugador j2 = context.getBean("jugador", Jugador.class);

		List<Jugador> equipo = context.getBean("arrayjugadores", List.class);

		System.out.println(equipo);
	}

}
