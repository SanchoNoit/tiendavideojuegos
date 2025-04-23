package es.mde.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="ORDENADORES")
public class Ordenador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_ordenador;

    private String nombreEquipo;
    private int puntuacionRendimiento;

    
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Accesorio.class, mappedBy = "ordenador")
    private Collection<Accesorio> accesorios = new ArrayList<>();
    
    public Ordenador() {
    }
        
    public Ordenador(String nombreEquipo, int puntuacionRendimiento) {
        this.nombreEquipo = nombreEquipo;
        this.puntuacionRendimiento = puntuacionRendimiento;
    }

    public Long getId_ordenador() {
        return id_ordenador;
    }

    public void setId_ordenador(Long id_ordenador) {
        this.id_ordenador = id_ordenador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntuacionRendimiento() {
        return puntuacionRendimiento;
    }

    public void setPuntuacionRendimiento(int puntuacionRendimiento) {
        this.puntuacionRendimiento = puntuacionRendimiento;
    }

    public Collection<Accesorio> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Collection<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }
        
    public void addAccesorio(Accesorio accesorio) {
        getAccesorios().add(accesorio);
        accesorio.setOrdenador(this);
    }
    
}
