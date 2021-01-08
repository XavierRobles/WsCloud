package cine;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import cine.entidad.Actor;
import cine.entidad.Director;
import cine.entidad.Peliculas;

@SpringBootApplication
@ImportResource("classpath:beans.xml")

public class CineRepasoSinHerenciasApplication {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = SpringApplication.run(CineRepasoSinHerenciasApplication.class, args);
		
		Peliculas p = context.getBean("peliculas", Peliculas.class);
		Actor a = context.getBean("actor", Actor.class);
		Director d = context.getBean("director", Director.class);
		a.setId(1);
		a.setNombre("Emili");
		a.setEdad(32);
		
		d.setId(1);
		d.setNombre("James cameron");
		d.setEdad(45);
		d.setFechaDeNacimiento("05/15/1978");
		
		
		p.setId(1);
		p.setActor(a);
		p.setDirector(d);
		
		Peliculas pelicula = context.getBean("pelicula", Peliculas.class);
		Peliculas pelicula2 = context.getBean("pelicula", Peliculas.class);
		
		System.out.println(p);
		
		
		System.out.println(pelicula);
		System.out.println(pelicula2);
	}

}
