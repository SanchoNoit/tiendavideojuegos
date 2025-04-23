package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.entidades.Microfono;

@Repository
public interface MicrofonoDAO extends JpaRepository<Microfono, Long> {

}
