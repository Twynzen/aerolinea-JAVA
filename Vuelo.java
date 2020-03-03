package MyAerolinea;

import java.util.ArrayList;

public class Vuelo {
	private String nVuelo;
	private Integer cantPasajeros;
	private String nombre;
	private ArrayList<Reserva> reservas;
	
	
	
	public Vuelo(String nVuelo, Integer cantPasajeros, String nombre) {
		super();
		this.nVuelo = nVuelo;
		this.cantPasajeros = cantPasajeros;
		this.nombre = nombre;
		this.reservas = new ArrayList<Reserva>();
	}
	public String getnVuelo() {
		return nVuelo;
	}
	public void setnVuelo(String nVuelo) {
		this.nVuelo = nVuelo;
	}
	public Integer getCantPasajeros() {
		return cantPasajeros;
	}
	public void setCantPasajeros(Integer cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	
	
}
