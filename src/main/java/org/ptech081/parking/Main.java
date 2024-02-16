package org.ptech081.parking;

import org.ptech081.parking.entities.*;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //crear carros con los constructores: 
        Vehiculo carrito1 =new 
        Vehiculo("GHI 89J", 
        TipoVehiculo.MOTO);
        
        Vehiculo carrito2 = new Vehiculo();
        carrito2.placa = "JSD 283";
        carrito2.tipoVehiculo = TipoVehiculo.MOTO;

        //crear clientes 
        Cliente cliente1 = new Cliente("Karol", "Cardona", 578942145L);
        Cliente cliente2 = new Cliente("David", "Lopez", 578945L);

        //Crear empleados
        Empleado empleado1 = new Empleado("Sara", 28743658L);
        Empleado empleado2 = new Empleado("Oscar", 54564646L);
        

        //invocar el metodo addVehiculo
        cliente1.addVehiculo(carrito1);
        cliente1.addVehiculo("TYG 546", TipoVehiculo.SEDAN);

        //invocar el metodo addVehiculo
        cliente2.addVehiculo(carrito2);
        cliente2.addVehiculo("HGT 023", TipoVehiculo.BUS);

        // Crear dos cupos 
        Cupo cupo1 = new Cupo('A');
        Cupo cupo2 = new Cupo('B');

        // Crar dos registros  E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.APRIL, 27);
        LocalTime horaFin = LocalTime.of(18, 30, 15);


        //guardar los registros en una lista
        List<Registro>misRegistros =  new ArrayList<Registro>();

        Registro registro1 = new  Registro(fechaInicio, horaInicio, fechaFin, horaFin, 10000L, cupo1, cliente1.misCarros.get(1), cliente1,empleado1);
        misRegistros.add(registro1);


        //registro nuevo 2

        // Crar dos registros  E/S
        LocalDate fechaInicio2 = LocalDate.now();
        LocalTime horaInicio2 = LocalTime.now();
        LocalDate fechaFin2 = LocalDate.of(2024, Month.APRIL, 25);
        LocalTime horaFin2= LocalTime.of(23, 45, 15);

        //crear registro 
        Registro registro2 = new Registro (fechaInicio2, horaInicio2, fechaFin2, horaFin2, 25000L, cupo2, cliente2.misCarros.get(1), cliente2, empleado2);
        misRegistros.add(registro2);



        System.out.println("Registros de E/S parking");
        for(Registro r: misRegistros){
            System.out.println("Cliente" + r.cliente.nombre + " " + r.cliente.apellidos + "|" + r.vehiculo.placa +" " 
                                            + r.vehiculo.tipoVehiculo +"|" + r.valor + "|" + r.fechaInicio +"|" + r.horaInicio +"|" + r.fechaFin +"|" + 
                                                r.horaFin +"|"  + "empleado:" + r.empleado.codigo +"|");
        }

       
        

        
       

    }
}