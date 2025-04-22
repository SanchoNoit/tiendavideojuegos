package es.mde.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ACCESORIOS")
public class Accesorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;

	@Column(length = 25, name = "nombreproducto")
	private String descripcion;
	
	private float precio;
	private boolean llevaPilas;
	
	public Accesorio() {}

	public Accesorio(String descripcion) {
		this.descripcion = descripcion;
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
	
	
	
}
