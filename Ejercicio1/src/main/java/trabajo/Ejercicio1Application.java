package trabajo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import trabajo.entidad.Empleado;
import trabajo.entidad.Nomina;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Ejercicio1Application {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context=SpringApplication.run(Ejercicio1Application.class, args);
		
		Empleado e1 = context.getBean("empleado", Empleado.class);
		Empleado e2 = context.getBean("empleado", Empleado.class);
		Nomina n1 = context.getBean("nomina", Nomina.class);
		Nomina n2 = context.getBean("nomina", Nomina.class);
		n1.setFecha("18/05/2020");
		n1.setSalario(1200.00);
		
		n2.setFecha("08/05/2019");
		n2.setSalario(1260.35);
		
		e1.setNombre("Pepe");
		e1.setCompañia("Telefonica");
		e1.setNomina(n1);
		
		e2.setNombre("Roberto");
		e2.setCompañia("Indra");
		e2.setNomina(n2);
		
		
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}
