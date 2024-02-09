package org.ptech081.parking.entities;

public class Vehiculo {

    public String placa;
    public TipoVehiculo tipoVehiculo;
    
    public Vehiculo() {
    }

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    
}
