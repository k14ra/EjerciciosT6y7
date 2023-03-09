package edu.alonso.daw.Tema67.restaurante;

import java.util.Objects;

public class Primeros extends Plato{

	private boolean	compartir;

	public Primeros(String nombre, double precio, boolean compartir) {
		super(nombre, precio);
		this.compartir = compartir;
	}

	public boolean isCompartir() {
		return compartir;
	}

	public void setCompartir(boolean compartir) {
		this.compartir = compartir;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(compartir);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Primeros other = (Primeros) obj;
		return compartir == other.compartir;
	}

	@Override
	public String toString() {
		return "Primer plato -> Para compartir? " + compartir + super.toString();
	}

	
	
	
}
