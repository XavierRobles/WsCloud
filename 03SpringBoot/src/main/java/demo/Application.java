package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Persona;

@SpringBootApplication
public class Application {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context =SpringApplication.run(Application.class, args);

		Persona p = context.getBean("persona", Persona.class);
		p.setNombre("pepe");
		System.out.println(p);
		Persona p2 = context.getBean("persona", Persona.class);
		System.out.println(p2);
	}

}
