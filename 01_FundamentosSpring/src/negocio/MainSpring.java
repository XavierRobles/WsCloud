package negocio;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import entidad.Persona;

public class MainSpring {

	//tendremos que guardar una referencia al contexto de spring
	public static ApplicationContext context = null;
	
	
	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("Recursos/context.xml");
		Persona p1 = (Persona) context.getBean("persona1");
		p1.setNombre("Xavier");
		p1.setEdad(21);
		p1.setPeso(80.1);
		
		//p1 = null;
		cambiarNombre("Ernion");
		System.out.println(p1.getNombre());
		
		Persona p2 = new Persona();
		p2 = null;
		
		p1 = context.getBean("persona2", Persona.class);
		System.out.println(p1.getEdad());
		
		
		Persona p3 = context.getBean("personaPrototype",  Persona.class);
		
		p3.setNombre("Gandaf");
		p3.setEdad(45);
		p3.setPeso(80);
		System.out.println(p3.getNombre());
		List<Persona> lp = context.getBean("listaPersonas", List.class);
		lp.add(p3);
		p3 = context.getBean("persona3", Persona.class);
		p3.getNombre();
		p3.getEdad();
		p3.getPeso();
		p3.getDireccion();
		System.out.println(p3.getDireccion());
		
		
	}
	
	public static void cambiarNombre(String nombre) {
		
		Persona p1 = (Persona) context.getBean("persona1");
		p1.setNombre(nombre);
		
	}

}
