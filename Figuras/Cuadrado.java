package edu.alonso.daw.Tema67.Figuras;

public class Cuadrado extends Figura {

	private int lado;

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}

	@Override
	public double getPerimetro() {
		return lado * 4;
	}

	@Override
	public String toString() {
		return "Cuadrado --> Lado: " + lado + super.toString();
	}
	
	public void imprimir(){
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
