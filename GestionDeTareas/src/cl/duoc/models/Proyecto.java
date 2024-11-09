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
public class Proyecto {
    private int idProyecto;
    private String nombre;
    private List<Task> tareas = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombre) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Task> getTareas() {
        return tareas;
    }

    public void setTareas(List<Task> tareas) {
        this.tareas = tareas;
    }
    
    
    
    public void agregarTarea(Task tareaNueva){
        tareas.add(tareaNueva);
        System.out.println("Tarea agregada");
    }
    
    
    public List<Task> obtenerTareas(){
        return tareas;
    }
}
