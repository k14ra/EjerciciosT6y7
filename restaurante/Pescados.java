package edu.alonso.daw.Tema67.restaurante;

public class Pescados extends Plato{

	public Pescados(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public String toString() {
		return "Pescado: " + super.toString();
	}
	
}
