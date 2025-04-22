package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.entidades.Juego;

@Repository
public interface JuegoDAO extends JpaRepository<Juego, Long> {

}
