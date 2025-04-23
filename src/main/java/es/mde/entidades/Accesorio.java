package es.mde.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ACCESORIOS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO")
@DiscriminatorValue("ACCESORIO")
public class Accesorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;

	@Column(length = 25, name = "nombreproducto")
	private String descripcion;
	
	private float precio;
	private boolean llevaPilas;
        
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ORDENADOR")
        private Ordenador ordenador;
	
	public Accesorio() {}

        public Accesorio(String descripcion) {
            this.descripcion = descripcion;
        }
        
	public Accesorio(String descripcion, Ordenador ordenador) {
		this.descripcion = descripcion;
                this.ordenador = ordenador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean llevaPilas() {
		return llevaPilas;
	}

	public void setLlevaPilas(boolean llevaPilas) {
		this.llevaPilas = llevaPilas;
	}

        public Ordenador getOrdenador() {
            return ordenador;
        }

        public void setOrdenador(Ordenador ordenador) {
            this.ordenador = ordenador;
        }

    @Override
    public String toString() {
        return "Accesorio con id=" + id + ", descripcion=" + descripcion + ", precio=" + precio;
    }
        
        
        
}
