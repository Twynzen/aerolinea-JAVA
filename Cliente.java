package MyAerolinea;

import java.util.ArrayList;

public class Cliente extends Persona {

	private ArrayList<Reserva> reserva;

	public Cliente() {
		super();

	}

	public Cliente(String nombre, String correo, String telefono, String documento) {
		super(nombre, correo, telefono, documento);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(ArrayList<Reserva> reserva) {
		this.reserva = reserva;
	}

	public void datosPersonales() {
		System.out.println("Nombre: " + this.getNombre() + "\n" + "Correo: " + this.getCorreo() + "\n" + "Telefono: "
				+ this.getTelefono() + "\n" + "Documento: " + this.getDocumento());
	}

}
