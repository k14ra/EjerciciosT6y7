package edu.alonso.daw.Tema67.restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Comanda {

	private Plato plato;
	private List<Plato> listaPlatos = new ArrayList<Plato>();

	private int numMesa;
	private int numComensales;

	public Comanda(int numMesa, int numComensales) {
		this.numMesa = numMesa;
		this.numComensales = numComensales;
	}

	public Plato getPlato() {
		return plato;
	}

	public int getNumMesa() {
		return numMesa;
	}

	public void setNumMesa(int numMesa) {
		this.numMesa = numMesa;
	}

	public int getNumComensales() {
		return numComensales;
	}

	public void setNumComensales(int numComensales) {
		this.numComensales = numComensales;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaPlatos, numComensales, numMesa, plato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comanda other = (Comanda) obj;
		return Objects.equals(listaPlatos, other.listaPlatos) && numComensales == other.numComensales
				&& numMesa == other.numMesa && Objects.equals(plato, other.plato);
	}

	public void addPlato(Plato plato) {
		listaPlatos.add(plato);
	}

	public int coste() {
		int suma = 0;
		for (int i = 0; i < listaPlatos.size(); i++) {
			suma += listaPlatos.get(i).getPrecio();
		}
		return suma;
	}

	public boolean hayDiabeticosEnLaMesa() {
		for (int i = 0; i < listaPlatos.size(); i++) {
			if (listaPlatos.get(i) instanceof Postres) {
				if (((Postres) listaPlatos.get(i)).isLlevaAzucar()) {
					return true;
				}
			}
		}return false;
	}

	public void print() {
		for (Plato plato : listaPlatos) {
			System.out.println(plato);
		}
	}
	
	@Override
	public String toString() {
		print();
		System.out.println("Precio total: " + coste());
		System.out.println("¿Hay diabeticos? "+ hayDiabeticosEnLaMesa());
		return "Fin comanda";
	}
}
