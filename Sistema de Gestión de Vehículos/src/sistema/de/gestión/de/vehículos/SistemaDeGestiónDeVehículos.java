/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.gestión.de.vehículos;

/**
 *
 * @author vina
 */
public class SistemaDeGestiónDeVehículos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VehiculoEstandar estandar1 = new VehiculoEstandar("TOYOTA", "VE001", "YARIS", 5000);
        VehiculoEstandar estandar2 = new VehiculoEstandar("NISSAN", "VE002", "V16", 3000);
        VehiculoEstandar estandar3 = new VehiculoEstandar("HYUNDAI", "VE003", "i10", 4000);
        
        VehiculoDeLujo lujo1 = new VehiculoDeLujo("BMW", 4, "VE+01", "M3", 15000);
        
        Sucursal sucursal1 = new Sucursal("Sucursal01", "ViñaDelMar");
        
    }
    
}
