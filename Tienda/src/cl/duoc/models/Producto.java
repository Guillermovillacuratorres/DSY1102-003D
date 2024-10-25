/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author gvill
 */
public abstract class Producto implements ICalcular{
    private final String idProducto;
    private String nombre;
    private double precio;
    private int stock;

//    public Producto() {
//    }

    public Producto(String idProducto, String nombre, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getIdProducto() {
        return idProducto;
    }

//    public void setIdProducto(String idProducto) {
//        this.idProducto = idProducto;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public abstract String toString();
    
    
    public void verStock(){
        System.out.println(this.getStock());
    }
    
    public abstract void verNombre();
    
    
    public void calcularIva(){
        this.precio = precio + precio*IVA/100;
    }
    
}
