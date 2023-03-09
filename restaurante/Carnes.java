package edu.alonso.daw.Tema67.restaurante;

import java.util.Objects;

public class Carnes extends Plato{

	private String gradoCoccion;

	public Carnes(String nombre, double precio, String gradoCoccion) {
		super(nombre, precio);
		this.gradoCoccion = gradoCoccion;
	}

	public String getGradoCoccion() {
		return gradoCoccion;
	}

	public void setGradoCoccion(String gradoCoccion) {
		this.gradoCoccion = gradoCoccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(gradoCoccion);
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
		Carnes other = (Carnes) obj;
		return Objects.equals(gradoCoccion, other.gradoCoccion);
	}

	@Override
	public String toString() {
		return "Carne --> Grado de coccion: " + gradoCoccion + "." + super.toString();
	}
	
	
}
