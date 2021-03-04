package mvc;

import javax.naming.Context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mvc.modelo.entidad.Usuario;
import mvc.modelo.persistencia.DaoUsuario;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		 
		 Usuario u = new Usuario();
		 u.setUsername("Xavi");
		 u.setPassword("1234");
		 DaoUsuario dao = context.getBean("daoUsuario", DaoUsuario.class);
		 dao.save(u);
		 
		 
		  
	}

}
