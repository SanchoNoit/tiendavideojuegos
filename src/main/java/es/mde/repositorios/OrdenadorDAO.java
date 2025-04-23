package es.mde.repositorios;

import es.mde.entidades.Ordenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenadorDAO extends JpaRepository<Ordenador, Long>{
    
}
