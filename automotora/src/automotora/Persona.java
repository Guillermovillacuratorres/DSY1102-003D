/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private String run, nombre,apellido;
    private long telefono;
    private LocalDate fecha_nacimiento;
    private boolean casado;

    public Persona() {
    }

    public Persona(String run, String nombre, String apellido, long telefono, LocalDate fecha_nacimiento, boolean casado) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.casado = casado;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona{" + "run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", fecha_nacimiento=" + fecha_nacimiento + ", casado=" + casado + '}';
    }

 

    
    
    
    
}
