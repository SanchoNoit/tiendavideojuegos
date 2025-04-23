package es.mde.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("MICROFONO")
public class Microfono extends Accesorio {

	private float impedanciaEntrada;

	public Microfono() {
	}

	public float getImpedanciaEntrada() {
		return impedanciaEntrada;
	}

	public void setImpedanciaEntrada(float impedanciaEntrada) {
		this.impedanciaEntrada = impedanciaEntrada;
	}
		
}
