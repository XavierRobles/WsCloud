package mvc.modelo.recursos;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import mvc.DaoUsuario;
import mvc.Usuario;

public class EntradaSalida {
	public final static int ALTA = 1;
	public final static int ENTRAR = 2;
	public final static int MOSTRAR = 3;
	public final static int SALIR = 0;
	private static Scanner sc = new Scanner(System.in);

	public static int mostrarMenu() {
		System.out.println("1- Alta");
		System.out.println("2- Login");
		System.out.println("3- Mstrar usuarios");
		System.out.println("0- Salir");
		int opcion = Integer.parseInt(sc.nextLine());

		return opcion;
	}

	public static Usuario insertarUsuarios(ApplicationContext contex) throws NoSuchAlgorithmException {
		System.out.println("Introduzca el nombre del usuario");
		String nombre = sc.nextLine();
		System.out.println("Introduzca su contraseña");
		String pass = sc.nextLine();
		Usuario user = contex.getBean("usuario", Usuario.class);
		user.setUser(nombre);
		user.setPass(pass);
		Usuario userpassHash = SHA.Codificar(user);
		String passhas = userpassHash.getPass();
		user.setPass(passhas);
		return user;

	}


	/*
	 * Una pequeña aplicacion que al arrancar nos muestre el siguiente menu
	 * 
	 * 1- Alta usuario 2- Login usuario 0- Salir
	 * 
	 * Si pulsamos 1, la app nos pedira un usuario y un password para guardar en
	 * bbdd. La constraseña se guardara hasheada
	 * 
	 * Si pulsamos 2, la app nos pedira un usuario y un password para entrar en la
	 * app, la app comprobará si el hash de la bbdd es igual que el hash que se
	 * genere del password. Si es igual, entraremos en la app, si es difernte dara
	 * error
	 * 
	 * Con 0 saldremos de la app :) :) :) :) :)
	 */

}
