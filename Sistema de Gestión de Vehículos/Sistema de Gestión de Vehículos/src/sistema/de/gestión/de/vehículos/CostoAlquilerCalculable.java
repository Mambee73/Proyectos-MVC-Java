/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistema.de.gestión.de.vehículos;

/**
 *
 * @author vina
 */
public interface CostoAlquilerCalculable {
    
    double IMPUESTOLUJO = 0.45;
    double IMPUESTOESTANDAR=0.30;
    
    
    
  
    public double calcularCostoAlquiler();
    
}
