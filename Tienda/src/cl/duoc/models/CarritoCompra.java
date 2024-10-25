/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gvill
 */
public class CarritoCompra {
    List<Producto> carrito = new ArrayList<>();
    
    public void agregarProducto(Producto parProducto){
        carrito.add(parProducto);
        System.out.println("Producto agregado correctamente!!!");
    }
    
    
    public void listarProductos(){
        for(Producto i : carrito){
            if(i instanceof ProductoFresco){
                ProductoFresco fresco = (ProductoFresco) i;
                System.out.println("ID: " + i.getIdProducto() +
                    " NOMBRE: " + i.getNombre() +
                    " TEMPERATURA FRESCO: " + fresco.getTemperaturaProductoFresco());
            }
            else if(i instanceof ProductoCongelado){
                ProductoCongelado congelado = (ProductoCongelado) i;
                System.out.println("ID: " + i.getIdProducto() +
                    " NOMBRE: " + i.getNombre() +
                    " TEMPERATURA FRESCO: " + congelado.getTemperaturaCongelacion());
            }

        }
    }
    
    
}
