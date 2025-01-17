/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestión.de.vehículos;

/**
 *
 * @author vina
 */
public abstract class Vehiculo implements CostoAlquilerCalculable {
    
    protected String idVehiculo,modelo;
    
    protected double costoBaseAlquiler;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, String modelo, double costoBaseAlquiler) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCostoBaseAlquiler() {
        return costoBaseAlquiler;
    }

    public void setCostoBaseAlquiler(double costoBaseAlquiler) {
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "CODIGO=" + idVehiculo + "Modelo= " + modelo + ", Costo Base Alquiler = " + costoBaseAlquiler + '}';
    }
    
    
    @Override
    public abstract double calcularCostoAlquiler();
    

    
    
    
}
