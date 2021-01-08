package cine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import cine.entidad.Director;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class CineRepasoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CineRepasoApplication.class, args);
		
		
		Director d = new Director();
		Director d1 = new Director();
		Director d2 = new Director();
		
		d1.setId(2);
		d1.setNombre("pepe");
		d1.setEdad(42);
		d1.setFechaDeNacimiento("14/1/15");
		
		d2.setId(2);
		d2.setNombre("Antonio");
		d2.setEdad(42);
		d2.setFechaDeNacimiento("25/10/20");
		
			System.out.println(d);
			System.out.println(d1);
			System.out.println(d2);
		
	}

}
