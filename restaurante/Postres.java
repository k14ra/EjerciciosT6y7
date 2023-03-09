package edu.alonso.daw.Tema67.restaurante;

import java.util.Objects;

public class Postres extends Plato {

	private boolean llevaAzucar;

	public Postres(String nombre, double precio, boolean llevaAzucar) {
		super(nombre, precio);
		this.llevaAzucar = llevaAzucar;
	}

	public boolean isLlevaAzucar() {
		return llevaAzucar;
	}

	public void setLlevaAzucar(boolean llevaAzucar) {
		this.llevaAzucar = llevaAzucar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(llevaAzucar);
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
		Postres other = (Postres) obj;
		return llevaAzucar == other.llevaAzucar;
	}

	@Override
	public String toString() {
		return "¿El postre lleva azucar? " + llevaAzucar + super.toString();
	}
	
	
	
}
