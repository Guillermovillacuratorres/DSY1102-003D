/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class Hotel {
    private String idHotel, nombreHotel;
    private ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel() {
        habitacionesDisponibles = new ArrayList<>();
    }

    public Hotel(String idHotel, String nombreHotel) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.habitacionesDisponibles = new ArrayList<>();
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(ArrayList<Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombreHotel=" + nombreHotel + ", habitacionesDisponibles=" + habitacionesDisponibles + '}';
    }
    
    
    
    public void agragarHabitacion(Habitacion parHabitacion){
        habitacionesDisponibles.add(parHabitacion);
    }
    
    public void reservarHabitacion(Cliente parCLiente){
        for(Habitacion i : habitacionesDisponibles){
            if(i.isDisponible()){
                Reserva nuevaReserva = new Reserva(this,i);
                parCLiente.agregarReserva(nuevaReserva);
                i.reservar();
                System.out.println("Reserva realizada en " + 
                        this.nombreHotel + " por el cliente " + 
                        parCLiente.getNombreCliente() + 
                        " en la habitacion " + i.getNumeroHabitacion());
                return;
            }
        }
        System.out.println("No hay habitaciones disponibles.");
    }
}
