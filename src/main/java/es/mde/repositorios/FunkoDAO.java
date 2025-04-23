package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.externas.Funko;

@Repository
public interface FunkoDAO extends JpaRepository<Funko, Long> {

}
