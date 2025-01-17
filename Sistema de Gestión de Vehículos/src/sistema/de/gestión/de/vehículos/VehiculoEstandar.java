/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestión.de.vehículos;

/**
 *
 * @author vina
 */
public class VehiculoEstandar extends Vehiculo implements CostoAlquilerCalculable{
    private String marca;

    public VehiculoEstandar(String marca, String idVehiculo, String modelo, double costoBaseAlquiler) {
        super(idVehiculo, modelo, costoBaseAlquiler);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    @Override
    public double calcularCostoAlquiler() {
        return costoBaseAlquiler*IMPUESTOESTANDAR;
    }
    
    public void mostrarInformacionEstandar(){
        
        System.out.println(".:DETALLE ALQUILER:.");
        System.out.println(".:Vehiculos Estandar:.");
        System.out.println(">MARCA: "+ marca);
        System.out.println(">MODELO: "+ modelo);
        System.out.println(">VALOR: "+costoBaseAlquiler);
    }
    
}
