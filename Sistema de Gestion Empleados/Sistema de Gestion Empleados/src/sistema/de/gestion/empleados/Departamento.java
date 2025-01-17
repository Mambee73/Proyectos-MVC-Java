/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestion.empleados;

import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class Departamento {
    
    private String idDepartamento,nombre;
    private ArrayList<Empleado> empleados;

    public Departamento() {
    }

    public Departamento(String idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Departamento{" + "idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", empleados=" + empleados + '}';
    }
    
    public void agregarEmpleado(Empleado emple){
        empleados.add(emple);
        System.out.println("Empleado agregado!." + emple.nombre);
    }
    
    public double calcularCostoTotalSalarios(){
        double totalSalarios = 0;
        for (Empleado emple : empleados) {
            totalSalarios += emple.calcularSalario();
        }
        return totalSalarios;
        
        
    }
    
    
    
}
