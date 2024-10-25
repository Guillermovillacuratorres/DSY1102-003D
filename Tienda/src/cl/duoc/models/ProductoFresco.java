/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author gvill
 */
public class ProductoFresco extends Producto{
    private float temperaturaProductoFresco;

//    public ProductoFresco() {
//    }
//
//    public ProductoFresco(float temperaturaProductoFresco) {
//        this.temperaturaProductoFresco = temperaturaProductoFresco;
//    }

    public ProductoFresco(float temperaturaProductoFresco, String idProducto, String nombre, double precio, int stock) {
        super(idProducto, nombre, precio, stock);
        this.temperaturaProductoFresco = temperaturaProductoFresco;
    }

    public float getTemperaturaProductoFresco() {
        return temperaturaProductoFresco;
    } 

    public void setTemperaturaProductoFresco(float temperaturaProductoFresco) {
        this.temperaturaProductoFresco = temperaturaProductoFresco;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "temperaturaProductoFresco=" + temperaturaProductoFresco + '}';
    }
    
    public float editarTemperatura(){
        return this.getTemperaturaProductoFresco() - 1;
    }
    
    
    public void verNombre(){
        
    }
    
    
    public void descontarStock(){
        
    }
    
    
    public float calcularTemperatura() {
        return this.temperaturaProductoFresco + 3;
    }
    
}
