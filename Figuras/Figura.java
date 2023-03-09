package edu.alonso.daw.Tema67.Figuras;

public abstract class Figura {

	private String color;
	
	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();

	@Override
	public String toString() {
		return "Figura --> Color: " + color;
	}
	
	

}
