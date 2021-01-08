package demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.net.server.Client;
import demo2.entidad.Cliente;

@SpringBootApplication
public class Application {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Cliente c = context.getBean("cliente", Cliente.class);
		c.setNombre("Xavi");
		c.setApellido("Robles");
		c.getPedido().setId(52);
		c.getPedido().setPrecio(444);
		
		System.out.println(c);
		Cliente c2 = context.getBean("cliente", Cliente.class);
	}

}
