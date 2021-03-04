package mvc;

import java.lang.StackWalker.Option;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mvc.modelo.recursos.EntradaSalida;
import mvc.modelo.recursos.SHA;

@SpringBootApplication
public class Application {
	public static ApplicationContext context = null;

	public static void main(String[] args) throws NoSuchAlgorithmException {

		ApplicationContext context = SpringApplication.run(Application.class, args);
		// Usuario u = context.getBean("usuario", Usuario.class);
		DaoUsuario dao = context.getBean("daoUsuario", DaoUsuario.class);

		int option = EntradaSalida.mostrarMenu();
		while (option != EntradaSalida.SALIR) {

			switch (option) {
			case EntradaSalida.ALTA:
				Usuario user = EntradaSalida.insertarUsuarios(context);
				// Usuario userSHA = SHA.Codificar(user);
				dao.save(user);
				break;

			case EntradaSalida.ENTRAR:
				Usuario buscar = EntradaSalida.insertarUsuarios(context);
				Usuario userBBDD = dao.findByUser(buscar.getUser());
				if (userBBDD.getPass().equals(buscar.getPass())) {
					System.out.println("Login correcto");

				} else {
					System.err.println("Error de login");
				}
				break;
			case EntradaSalida.MOSTRAR:
				List<Usuario> lista_usuarios = dao.findAll();
				for (Usuario usuario : lista_usuarios) {

					System.out.println(usuario.getUser());
				}
				
				break;
			case EntradaSalida.SALIR:

				break;
			}
			option = EntradaSalida.mostrarMenu();
		}
		System.out.println("Cerrando programa.....\n");

	}

}
