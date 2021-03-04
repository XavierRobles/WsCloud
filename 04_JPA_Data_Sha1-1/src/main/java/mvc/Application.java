package mvc;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Pelicula p = context.getBean("pelicula", Pelicula.class);
		p.setTitulo("La guerra de las galaxias");
		p.setDirector("George lucas");
		p.setYear("1982");
		DaoPelicula dao = context.getBean("daoPelicula", DaoPelicula.class);
		
		byte[] pelicula1 = p.getDirector().getBytes();
		byte[] pelicula2 = p.getTitulo().getBytes();
		byte[] pelicula3 = p.getYear().getBytes();

		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.update(pelicula1);
			md.update(pelicula2);
			md.update(pelicula3);


		byte[] resumen = md.digest();
		String mensaje = new String(resumen);
		System.out.println("Resumen hash: " + mensaje);
		
		String mensajeHashHex = javax.xml.bind.DatatypeConverter.printHexBinary(resumen);
		System.out.println(mensajeHashHex);
		
		p.setDirector(mensajeHashHex);
		dao.save(p);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
