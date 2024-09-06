/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Venta {
    private int id_venta;
    private Vendedor vendedor;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fecha_compra;

    public Venta() {
    }

    public Venta(int id_venta, Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, LocalDate fecha_compra) {
        this.id_venta = id_venta;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha_compra = fecha_compra;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDate fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", vendedor=" + vendedor.getPersona().getNombre() + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", fecha_compra=" + fecha_compra + '}';
    }
    
    
    
    
}
