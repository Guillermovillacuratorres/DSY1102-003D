/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservahotel;

import cl.duoc.models.Cliente;
import cl.duoc.models.Habitacion;
import cl.duoc.models.Hotel;
import cl.duoc.models.Reserva;

/**
 *
 * @author Cetecom
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotelUno = new Hotel("H001", "Cinco estrellas");
        
        
        hotelUno.agragarHabitacion(new Habitacion("HA001", 3500));
        
        Cliente clienteUno = new Cliente("CL001","Mario Hugo");
        

        
        hotelUno.reservarHabitacion(clienteUno);
        hotelUno.reservarHabitacion(clienteUno);
        System.out.println(hotelUno);
        
        System.out.println("-----------------------------------");
        
        System.out.println("Reservas del cliente " + clienteUno.getNombreCliente() + ": ");
        for(Reserva i : clienteUno.getReservasRealizadas()){
            System.out.println("HOTEL: " + i.getHotel().getNombreHotel() + " HBITACION: " + 
                                i.getHabitacionReservada().getNumeroHabitacion());
                    
        }
    }
    
}
