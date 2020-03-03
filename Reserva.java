package MyAerolinea;

import java.util.ArrayList;

public class Reserva {
private String destino;
private String costo;
private String tipoReserva;
private ArrayList<Vuelo> vuelo;


public Reserva() {
	super();
	// TODO Auto-generated constructor stub
}
public Reserva(String destino, String costo,  String tipoReserva) {
	super();
	this.destino = destino;
	this.costo = costo;
	this.tipoReserva = tipoReserva;
	this.setVuelo(new ArrayList<Vuelo>());
}
public String getDestino() {
	return destino;
}
public void setDestino(String destino) {
	this.destino = destino;
}
public String getCosto() {
	return costo;
}
public void setCosto(String costo) {
	this.costo = costo;
}

public String getTipoReserva() {
	return tipoReserva;
}
public void setTipoReserva(String tipoReserva) {
	this.tipoReserva = tipoReserva;
}
public ArrayList<Vuelo> getVuelo() {
	return vuelo;
}
public void setVuelo(ArrayList<Vuelo> vuelo) {
	this.vuelo = vuelo;
}



public void registrarVuelo(){
	System.out.println(" Destino " + destino + "\n" + " Costo " + costo + "\n" +  " Tipo de reserva " + tipoReserva);
}







}
