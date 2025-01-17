/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestion.empleados;

/**
 *
 * @author vina
 */
public class EmpleadoPorHora extends Empleado {

    private int horasTrabajadas;
    private double tarifa;

    public EmpleadoPorHora(int horasTrabjadas, double tarifa, String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
        this.horasTrabajadas = horasTrabjadas;
        this.tarifa = tarifa;
    }

    public int getHorasTrabjadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabjadas(int horasTrabjadas) {
        this.horasTrabajadas = horasTrabjadas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    
    @Override
    public double calcularSalario() {
        return sueldoBase + (horasTrabajadas*tarifa)+ calcularBonus();
        
        
    }

    @Override
    public double calcularBonus() {
        return horasTrabajadas>160 ? (horasTrabajadas=160) * tarifa*0.20 : 0;
        
    }
    

    
}
