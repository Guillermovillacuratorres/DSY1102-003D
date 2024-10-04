/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class ArrayListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> mascotas = new ArrayList<>();
        
        
        
        mascotas.add("Perro");
        mascotas.add("Gato");
        mascotas.add("Tortuga");
        mascotas.add("Tigre");
        mascotas.add("Leon");
        mascotas.add("Raton");
        
        mascotas.remove("Perro");
        //mascotas.clear();
        
        System.out.println(mascotas.indexOf("gato"));
        System.out.println(mascotas.contains("Tortuga"));          
        System.out.println(mascotas);
        System.out.println(mascotas.size());
        System.out.println(mascotas.get(3)); 
        
        for(String i : mascotas){
            System.out.println(i);
        }
        
    }
    
}
