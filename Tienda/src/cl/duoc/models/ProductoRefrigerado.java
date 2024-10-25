/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author gvill
 */
public class ProductoRefrigerado extends Producto{
    private float temperaturaRefrigeracion;

//    public ProductoRefrigerado() {
//    }
//
//    public ProductoRefrigerado(float temperaturaRefrigeracion) {
//        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
//    }

    public ProductoRefrigerado(float temperaturaRefrigeracion, String idProducto, String nombre, double precio, int stock) {
        super(idProducto, nombre, precio, stock);
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    public float getTemperaturaRefrigeracion() {
        return temperaturaRefrigeracion;
    }

    public void setTemperaturaRefrigeracion(float temperaturaRefrigeracion) {
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "temperaturaRefrigeracion=" + temperaturaRefrigeracion + '}';
    }

    @Override
    public void verNombre() {
        
    }
    
    
    public void descontarStock(){
        
    }


    public float calcularTemperatura() {
        return this.temperaturaRefrigeracion + 1;
    }
    
    
    
}
