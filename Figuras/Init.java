package edu.alonso.daw.Tema67.Figuras;

import java.util.ArrayList;
import java.util.List;

public class Init {

	public static void main(String[] args) {
		Figura circulo = new Circulo("rojo", 10);
		Figura cuadrado = new Cuadrado("Azul", 3);
		Figura triangulo = new Triangulo("Verde", 3.0, 4.0);


		//Crear varias instancias de distintas figuras y almacenarlas en una lista.
		List<Figura> listado = new ArrayList<>();
		listado.add(circulo);
		 
		System.out.println("Primera figura: " + circulo);
		System.out.println("Area: " + circulo.getArea());
		
		((Cuadrado)cuadrado).imprimir();
		
		
		//Mostrar todas las figuras, con sus areas y perimetros en el mismo for.
		
		/*
		for (Figura figura : listado) {
			System.out.println("Info figura " + figura); //invoco al metodo string
			System.out.println("Area: " + figura.getArea());
			System.out.println("Perimetro: " + figura.getPerimetro());
			//Por cada figura concreta, mostrar un mensaje distinto dentro del mismo for.
			//En el caso concreto del cuadrado, imprimir con asteriscos la figura, dentro del mismo for.
			if(figura instanceof Circulo) {
				System.out.println("Es un circulo");
			} else if ((figura instanceof Triangulo)) {
				System.out.println("Es un triangulo");
			} else if ((figura instanceof Cuadrado)) {
				System.out.println("Es un cuadrado");
			}
			System.out.println();
		}
		*/
		
		for (int i = 0; i < listado.size(); i++) {
			System.out.println("Info figura " + listado.get(i)); //invoco al metodo string
			System.out.println("Area: " + listado.get(i).getArea());
			System.out.println("Perimetro: " + listado.get(i).getPerimetro());
			//Por cada figura concreta, mostrar un mensaje distinto dentro del mismo for.
			//En el caso concreto del cuadrado, imprimir con asteriscos la figura, dentro del mismo for.
			if(listado.get(i) instanceof Circulo) {
				System.out.println("Es un circulo");
			} else if ((listado.get(i) instanceof Triangulo)) {
				System.out.println("Es un triangulo");
			} else if ((listado.get(i) instanceof Cuadrado)) {
				System.out.println("Es un cuadrado");
				((Cuadrado)listado.get(i)).imprimir();
			}
			
			System.out.println();
		}
	}

}
