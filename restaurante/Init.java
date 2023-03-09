package edu.alonso.daw.Tema67.restaurante;

public class Init {

	public static void main(String[] args) {
		
		Comanda comanda = new Comanda(5, 4);
		
		Plato plato1 = new Carnes("Filete", 10, "Al punto");
		Plato plato2 = new Pescados("Atun",  10);
		Plato plato3 = new Postres("Tarta", 7, true);
		Plato plato4 = new Primeros("Ensalada", 8, false);
		
		comanda.addPlato(plato1);
		comanda.addPlato(plato2);
		comanda.addPlato(plato3);
		comanda.addPlato(plato4);
		
		comanda.toString();
		
	}
}
