
package proyecto.comercio.crud;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String idCliente,nombre;
    private List<Pedido> pedidoRealizado = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidoRealizado() {
        return pedidoRealizado;
    }

    public void setPedidoRealizado(List<Pedido> pedidoRealizado) {
        this.pedidoRealizado = pedidoRealizado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", pedidoRealizado=" + pedidoRealizado + '}';
    }
    
    public void agregarPedido (Pedido pedido){
        pedidoRealizado.add(pedido);
        System.out.println("Pedido agregado correctamente!");
    }
}
