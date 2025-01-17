/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestión.de.vehículos;

import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class Sucursal {
    
    private String idSucursal, nombre;
    private ArrayList<Vehiculo> vehiculosDisponibles;

    public Sucursal() {
    }

    public Sucursal(String idSucursal, String nombre) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.vehiculosDisponibles = new ArrayList<>();
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }

    public void setVehiculosDisponibles(ArrayList<Vehiculo> vehiculosDisponibles) {
        this.vehiculosDisponibles = vehiculosDisponibles;
    }
    
    public void agregarVehiculo(Vehiculo vehi){
        vehiculosDisponibles.add(vehi);
        System.out.println("Vehiculo ingresado al catalogo.");
        
    }

    
    public double calcularCostoTotalesAlquiler() {
        double totalAlquilados = 0;
        for (Vehiculo vehi : vehiculosDisponibles) {
            totalAlquilados += vehi.calcularCostoAlquiler();
        }
        return totalAlquilados;
    }
    
    
    
    
    
}
