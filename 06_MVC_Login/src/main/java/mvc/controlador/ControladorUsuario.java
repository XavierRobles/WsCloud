package mvc.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import mvc.modelo.entidad.Usuario;
import mvc.modelo.negocio.GestorUsuario;

@Controller
public class ControladorUsuario {
	@Autowired
	private GestorUsuario gestorUsuario;
	@PostMapping("/doLogin")
	public String login(@RequestParam("nombre") String username, @RequestParam("pass") String password, Model model) {
		System.err.println("llega");
		Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);
        boolean validado = gestorUsuario.validar(usuario);

        if (validado) {
        	model.addAttribute("nombre", usuario);
        	model.addAttribute("fecha", new Date());
        	List<String> lista = new ArrayList<String>();
        	lista.add(username);
        	lista.add(password);
        	model.addAttribute("lista", lista);
            return "index";
            
        }
        return "ErrorLogin";
		
		
	}

}
