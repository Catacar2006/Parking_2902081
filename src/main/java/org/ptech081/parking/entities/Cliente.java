package org.ptech081.parking.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public Long identificacion;
    public List <Vehiculo> misCarros;
    
    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, Long identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.misCarros = new ArrayList<Vehiculo>();
    }

        //Primera sobrecarga de addVehiculo 
    public void addVehiculo(Vehiculo veh){
        this.misCarros.add(veh);
    }

    //Segunda sobrecarga de addVehiculo 
    public void addVehiculo(String placa,TipoVehiculo tv){
        Vehiculo veh = new Vehiculo(placa, tv);//creamos el carro y vinculamos lo creado a la lista
        this.misCarros.add(veh);//instanciando el carro a la lista

    }
}
