package MyAerolinea;

import co.com.Interfaz.IAerolinea;

public class Empleados extends Persona implements IAerolinea{
private String codEmpleado;
private String cargo;
private Double salario;


public Empleados() {
	super();
	// TODO Auto-generated constructor stub
}


public Empleados(String nombre, String correo, String telefono, String documento) {
	super(nombre, correo, telefono, documento);
	// TODO Auto-generated constructor stub
}


public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}

public String getCodEmpleado() {
	return codEmpleado;
}

public void setCodEmpleado(String codEmpleado) {
	this.codEmpleado = codEmpleado;
}


@Override
public String registrarEmpleado() {
	
	System.out.println("registrar empleado");
	System.out.println("Nombre" + this.getNombre());
	
	
	
	return null;
}


@Override
public String despedirEmpleado() {
	// TODO Auto-generated method stub
	return null;
}



}
