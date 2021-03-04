package mvc.modelo.persitencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvc.modelo.entidad.Pelicula;
@Repository
public interface DaoPelicula extends JpaRepository<Pelicula, Integer>{
	public Pelicula findByTitulo(String titulo);

}
