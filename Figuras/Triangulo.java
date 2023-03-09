package edu.alonso.daw.Tema67.Figuras;

public class Triangulo extends Figura{

	private double base;
	private double altura;

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return (base * altura) / 2;
	}

	@Override
	public double getPerimetro() {
		//Math.sqrt  --> RAIZ CUADRADA
		//Suponemos que es un triandulo rectangulo
		double hipotenusa = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
		return altura + base + hipotenusa;
	}

	@Override
	public String toString() {
		return "Triangulo --> Base:" + base + ", altura: " + altura + super.toString();
	}
}
