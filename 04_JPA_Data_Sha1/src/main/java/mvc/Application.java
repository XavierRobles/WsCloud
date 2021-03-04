package mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mvc.modelo.entidad.Pelicula;
import mvc.modelo.persitencia.DaoPelicula;

@SpringBootApplication
public class Application {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Pelicula p = context.getBean("pelicula", Pelicula.class);
		p.setTitulo("La guerra de las galaxias");
		p.setDirector("George lucas");
		p.setYear(1982);
		DaoPelicula dao = context.getBean("daoPelicula", DaoPelicula.class);
		dao.save(p);

	}

}
