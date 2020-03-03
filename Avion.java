package MyAerolinea;

import java.util.ArrayList;
import java.util.Arrays;

import co.com.Interfaz.IAvion;

public class Avion implements IAvion{
private Integer nPasajeros;
private String tipo;
private ArrayList<Vuelo>vuelo ;





public Avion() {
        //super();
}

public Avion(Integer nPasajeros, String tipo) {
        super();
        this.nPasajeros = nPasajeros;
        this.tipo = tipo;
        this.vuelo= new ArrayList<Vuelo>();
        
}

public Integer getnPasajeros() {
        return nPasajeros;
}
public void setnPasajeros(Integer nPasajeros) {
        this.nPasajeros = nPasajeros;
}
public String getTipo() {
        return tipo;
}
public void setTipo(String tipo) {
        this.tipo = tipo;
}
public ArrayList<Vuelo> getVuelo() {
        return vuelo;
}
public void setVuelo(ArrayList<Vuelo> vuelo) {
        this.vuelo = vuelo;
}
public void datosAvion() {
        System.out.println("*********************************************************");
        System.out.println("Tamaño de avion: " + tipo + "\nCantidad maxima de pasajeros: " + nPasajeros);
}

@Override
public void despegar() {
        System.out.println("El avión ha despegado con exito");
        
}

@Override
public void volar() {
        
        System.out.println("El avion vuela con exito");
        
}

@Override
public void aterrizar() {
        System.out.println("El avion aterriza con exito");
        
}



}
