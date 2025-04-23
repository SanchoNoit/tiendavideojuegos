package es.mde.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ALTAVOZ")
public class Altavoz extends Accesorio {

	private float impedanciaMaximaSalida;

	public Altavoz() {
	}

	public float getImpedanciaMaximaSalida() {
		return impedanciaMaximaSalida;
	}

	public void setImpedanciaMaximaSalida(float impedanciaMaximaSalida) {
		this.impedanciaMaximaSalida = impedanciaMaximaSalida;
	}
	
}
