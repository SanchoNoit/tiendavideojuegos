package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.entidades.Altavoz;

@Repository
public interface AltavozDAO extends JpaRepository<Altavoz, Long> {

}
