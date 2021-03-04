package mvc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
//poner nombre a la tabla, por defecto coge el nombre de la clase
@Scope("prototype") // genera objetos fuera del contexto de sprin 
public class Usuario {
	@Id
	// con el @id pone la primari key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // con esto le decimos que el valos sea automatico
	private int id;
	private String user;
	private String pass;
	
	
	public Usuario() {
		super();
	}
	public Usuario(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", user=" + user + ", pass=" + pass + "]";
	}

}
