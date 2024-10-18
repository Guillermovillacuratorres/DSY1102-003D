/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.comercio.crud;

/**
 *
 * @author Cetecom
 */
public class Ropa extends Producto{
    private String talla,color;

    public Ropa() {
    }

    public Ropa(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", color=" + color + '}';
    }
    
    public void ajustarTalla (String nuevaTalla){
        this.setTalla(nuevaTalla);
        System.out.println("La talla ha sido modificada, la actual es" + nuevaTalla);
                
    }
    
    
    
    
}
