package org.ptech081.parking.entities;
import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    // Atributos intrinsecos
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Long valor;

    // Atributos de relacion

    public Cupo cupo;
    public Vehiculo vehiculo;
    public Cliente cliente;
    

    //Constructores 
    public Registro() {
        
    }


    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Long valor,
            Cupo cupo, Vehiculo vehiculo, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.cupo = cupo;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }




}
