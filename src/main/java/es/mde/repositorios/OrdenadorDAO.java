package es.mde.repositorios;

import es.mde.entidades.Ordenador;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenadorDAO extends JpaRepository<Ordenador, Long>{

	List<Ordenador> readByPuntuacionRendimientoBetween(int i, int j);

	List<Ordenador> readByNombreEquipoContaining(String string);
    
}
