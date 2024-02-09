package org.ptech081.parking;

import org.ptech081.parking.entities.*;

public class Main {
    public static void main(String[] args) {

        //crear carros con los constructores: 
        Vehiculo carrito1 =new Vehiculo("GHI 89J", TipoVehiculo.MOTO);
        
        Vehiculo carrito2 = new Vehiculo();
        carrito2.placa = "JSD 283";
        carrito2.tipoVehiculo = TipoVehiculo.MOTO;

        //crear clientes 
        Cliente cliente1 = new Cliente("Karol", "Cardona", 578942145L);

        //invocar el metodo addVehiculo
        cliente1.addVehiculo(carrito1);
        cliente1.addVehiculo("TYG 546", TipoVehiculo.SEDAN);

        //recorrer los vehiculos de los clientes 
        for( Vehiculo v: cliente1.misCarros){
            System.out.println(v.placa + "" + v.tipoVehiculo);
            System.out.println( "---------------" );
        }

    }
}