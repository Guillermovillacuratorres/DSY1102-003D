package proyecto.comercio.crud;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Producto> productos = new ArrayList<>();
    private double total;

    public Pedido(){
    }
    
    public Pedido(double total) {
        this.total = total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double calcularTotal(){
        this.total = 0;
        for(int i=0; i<productos.size();i++){
            this.total +=productos.get(i).getPrecio();
        }
        return this.total;
    }
    
    public void agregarProducto(Producto p){
        productos.add( p);
        System.out.println("Producto agregado a la lista correctamente.");
    }
    
}
