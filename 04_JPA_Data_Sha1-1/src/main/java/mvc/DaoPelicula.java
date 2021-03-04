package mvc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DaoPelicula extends JpaRepository<Pelicula, byte[]>{
	public Pelicula findByTitulo(String titulo);

}