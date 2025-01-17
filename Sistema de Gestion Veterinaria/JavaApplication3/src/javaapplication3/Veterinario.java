/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author vina
 */
public class Veterinario {
    
    private String idVeterinario,nombre,apellido,especialidad,fechaIngreso;

    public Veterinario() {
    }

    public Veterinario(String idVeterinario, String nombre, String apellido, String especialidad, String fechaIngreso) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Veterinario{" + "idVeterinario=" + idVeterinario + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
    
}
