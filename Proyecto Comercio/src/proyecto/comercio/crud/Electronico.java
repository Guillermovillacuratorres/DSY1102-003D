/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.comercio.crud;

/**
 *
 * @author Cetecom
 */
public class Electronico extends Producto {
    private String marcaProducto;
    private int garantiaMeses;

    public Electronico() {
    }

    public Electronico(String marcaProducto, int garantiaMeses) {
        this.marcaProducto = marcaProducto;
        this.garantiaMeses = garantiaMeses;
    }

    public Electronico(String marcaProducto, int garantiaMeses, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.marcaProducto = marcaProducto;
        this.garantiaMeses = garantiaMeses;
    }


    

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "Electronico{" + "marcaProducto=" + marcaProducto + ", garantiaMeses=" + garantiaMeses + '}';
    }
    public void extenderGarantia(int mesesExtra){
        garantiaMeses += mesesExtra;
        System.out.println("Su garantia ha sido extendida por "+mesesExtra+", por lo cual ahora tiene "+garantiaMeses);
    }
}
