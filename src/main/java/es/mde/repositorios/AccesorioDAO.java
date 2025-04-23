package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.entidades.Accesorio;
import java.util.List;

@Repository
public interface AccesorioDAO extends JpaRepository<Accesorio, Long> {

    public List<Accesorio> findByDescripcionContaining(String string);

}
