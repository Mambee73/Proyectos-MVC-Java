/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestion.empleados;

/**
 *
 * @author vina
 */
public class EmpleadoAsalariado extends Empleado implements BonusCalculable{

    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }
    
    
 
    @Override
    public double calcularBonus() {
        return sueldoBase* BONO;
        
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + calcularBonus();
    }
    

    
}
