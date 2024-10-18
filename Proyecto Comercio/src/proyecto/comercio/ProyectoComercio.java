/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.comercio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import proyecto.comercio.crud.Electronico;
import proyecto.comercio.crud.Pedido;
import proyecto.comercio.crud.Producto;

/**
 *
 * @author Cetecom
 */
public class ProyectoComercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Electronico> listadoProductosElectronicos = new ArrayList<>();
        Pedido pedidoUno = new Pedido();
        int opcion = 0;
        
        while(opcion != 7){
            System.out.println("----MENU----");
            System.out.println("[1] - Agregra producto electronico");
            System.out.println("[2] - Listar productos electronico");
            System.out.println("[3] - Agregar productos a pedido");
            System.out.println("[4] - Listar productos del pedido");
            System.out.println("[5] - Agregar pedidos al cliente");
            System.out.println("[6] - Listar pedidos del cliente");
            System.out.println("[7] - Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    Electronico nuevoELectronico = new Electronico();
                    
                    System.out.println("Ingrese la marca del producto: ");
                    nuevoELectronico.setMarcaProducto(entrada.next());
                    
                    System.out.println("Ingrese el nombre: ");
                    nuevoELectronico.setNombre(entrada.next());
                    
                    System.out.println("Ingrese la garantia del producto en meses: ");
                    nuevoELectronico.setGarantiaMeses(entrada.nextInt());
                    
                    System.out.println("Ingrese el id: ");
                    nuevoELectronico.setIdProducto(entrada.next());
                    
                    System.out.println("Ingrese el precio: ");
                    nuevoELectronico.setPrecio(entrada.nextDouble());
                    
                    listadoProductosElectronicos.add(nuevoELectronico);
                    System.out.println("Producto agregado correctamente.");
                    break;
                case 2:
                    if(listadoProductosElectronicos.size() > 0){
                        for(Electronico i : listadoProductosElectronicos){
                            System.out.println("ID: " + i.getIdProducto() + 
                                                " NOMBRE: " + i.getNombre() + 
                                                " PRECIO: " + i.getPrecio());
                        }
                    }else{
                        System.out.println("No hay productos...");
                    }
                    break;
                case 3:
                    String idProductoBuscar = "";
                    System.out.println("Ingrese el id del producto: ");
                    idProductoBuscar = entrada.next();
                    for (Electronico i : listadoProductosElectronicos){
                        if(i.getIdProducto().equals(idProductoBuscar)){
                            pedidoUno.agregarProducto(i);
                            System.out.println("Producto agregado al pedido correctamente!");
                        }
                    }
                case 4:
                    for(Producto i : pedidoUno.getProductos()){
                        System.out.println("ID: " + i.getIdProducto() + 
                                            " NOMBRE: " + i.getNombre());
                    }
                    System.out.println("EL total del pedido es: " + pedidoUno.calcularTotal());
                    break;
            }
        }
        
    }
    
}
