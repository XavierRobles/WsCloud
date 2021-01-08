package negocio;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Persona;


public class MainAutowired {
	
	private static ApplicationContext context = null;
	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("recursos/autowired.xml");
		Persona p = context.getBean("persona", Persona.class);
		System.out.println(p);
		
		
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
}
