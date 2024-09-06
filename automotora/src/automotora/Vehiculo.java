/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String patente,marca,modelo;
    private int precio, anio_fabricacion;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, int precio, int anio_fabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", anio_fabricacion=" + anio_fabricacion + '}';
    }
    
    
    
    
    
    public void mostrarElementos(int n1, Vehiculo car){
        System.out.println("Auto ----> " + car.getPatente());
    }
     
    
    public void calcularIvaVehiculo(){
        System.out.println("Vehiculo con IVA: " + precio * 1.19);
        System.out.println("Valor neto vehiculo: " + precio);
    }
    
    
    
    public String marcaAuto(){
        return "La marca del auto: " + marca;
    }
    
}
