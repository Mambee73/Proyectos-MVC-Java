/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestión.de.vehículos;

/**
 *
 * @author vina
 */
public class VehiculoDeLujo extends Vehiculo{

    private String marca;
    private double cilindrada;

    public VehiculoDeLujo(String marca, double cilindrada, String idVehiculo, String modelo, double costoBaseAlquiler) {
        super(idVehiculo, modelo, costoBaseAlquiler);
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    
    
    public void mostrarInformacionLujos(){
        System.out.println(".:DETALLE ALQUILER:.");
        System.out.println(".:Vehiculos de Lujo:.");
        System.out.println(">MARCA: "+ marca);
        System.out.println(">MODELO: "+ modelo);
        System.out.println(">Cilindradas: "+cilindrada );
        System.out.println(">VALOR: "+costoBaseAlquiler);
    }

    @Override
    public double calcularCostoAlquiler() {
        return costoBaseAlquiler*IMPUESTOLUJO;
    }
    
    
}
