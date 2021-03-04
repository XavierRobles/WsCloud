package mvc;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DaoUsuario extends JpaRepository<Usuario, byte[]> {
	public Usuario findByPass(String pass);
	public Usuario findByUser(String nombre);
	

}
