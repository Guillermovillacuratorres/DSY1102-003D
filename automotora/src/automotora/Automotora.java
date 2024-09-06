/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotora;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;



/**
 *
 * @author Cetecom
 */
public class Automotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona p2 = new Persona("12402429-2", "Juan", "Valdes", 912341234,LocalDate.now() , true);
        Scanner entrada = new Scanner(System.in);
        //Scanner entradaDos = new Scanner(System.in);
        Persona pVendedor = new Persona();
        Vendedor vendedorUno = new Vendedor();  
        Vehiculo auto = new Vehiculo();
        p1.setNombre("Pedro");
        System.out.println(p2);
        
        
        int opcion = 0;
        /*
        do{
            System.out.println("do while");
        }while(opcion != 3);
        */
        
        
        
        while(opcion != 3){
            System.out.println("*****Menu*****");
            System.out.println("[1] - Agregar vendedor");
            System.out.println("[2] - Agregar cliente");
            System.out.println("[3] - Agregar vehiculo");
            System.out.println("[4] - Generar venta");
            System.out.println("[5] - Salir");
            
            opcion = entrada.nextInt();
            
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el run del vendedor: ");
                    pVendedor.setRun(entrada.next());
                    
                    System.out.println("Ingrese el nombre del vendedor: ");
                    pVendedor.setNombre(entrada.next());
                    
                    System.out.println("Ingrese el apellido del vendedor: ");
                    pVendedor.setApellido(entrada.next());
                    
                    int anio, mes, dia;

                    System.out.println("Ingrese el año de nacimiento del vendedor : ");
                    anio = entrada.nextInt();
                    
                    System.out.println("Ingrese el mes de nacimiento del vendedor: [1 - 12]");
                    mes = entrada.nextInt();
                    
                    System.out.println("Ingrese el dia de nacimiento del vendedor: [1  - 31] ");
                    dia = entrada.nextInt();

                    pVendedor.setFecha_nacimiento(LocalDate.of(anio, mes, dia));
                    
                    
                    System.out.println("Ingrese el telefono del vendedor: ");
                    pVendedor.setTelefono(entrada.nextLong());
                    
                    System.out.println("Ingrese si el vendedor esta casado: ");
                    pVendedor.setCasado(entrada.nextBoolean());
                    
                    vendedorUno.setId_vendedor(1);
                    vendedorUno.setPersona(pVendedor);
                    
                    
                    break;
                case 2:
                    System.out.println(vendedorUno);
                    break;
                case 3:
                    System.out.println("opcion 3");
                    
                    auto.setPatente("abcd12");
                    auto.setPrecio(5000);
                    auto.mostrarElementos(1,auto);
                    
                    auto.calcularIvaVehiculo();
                    
                    System.out.println(auto.marcaAuto());
                    
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("Salieeendo chaito !!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            
        }
        
        
        
        
    }
    
}
