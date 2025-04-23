package es.mde.externas;

public class Funko {
	
	private Long id;
	private String descripcion;
	private float precio;
	
	public Funko() {}

	public Funko(String descripcion, float precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public Long getId_funkoLong() {
		return id;
	}

	public void setId_funkoLong(Long id_funkoLong) {
		this.id = id_funkoLong;
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
	
	
	
}
