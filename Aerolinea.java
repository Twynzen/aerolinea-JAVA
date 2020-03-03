package MyAerolinea;
//aerolinea

//pagar 
//reservar
//retirar reserva
//modificar cambiar nombre de la reserva 

import java.util.ArrayList;

public class Aerolinea {
	private String nombre;
	private String telefono;
	private ArrayList<Cliente> clientes;
	private ArrayList<Vuelo> vuelo;
	private ArrayList<Avion> aviones;

	public Aerolinea(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.aviones = new ArrayList<Avion>();
		this.clientes = new ArrayList<Cliente>();
		this.vuelo = new ArrayList<Vuelo>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Vuelo> getVuelo() {
		return vuelo;
	}

	public void setVuelo(ArrayList<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}

	public ArrayList<Avion> getAviones() {
		return aviones;
	}

	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}

	public void datosAerolinea() {
		System.out.println("*********************************************************");
		System.out.println("Nombre Aerolinea: " + nombre + "\nTelefono: " + telefono);
	}

}
