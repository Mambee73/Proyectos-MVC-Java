/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author vina
 */
public class Tratamiento {

    private String idTratamiento, nombreTratamiento;
    private Mascota idMascota;
    private Veterinario idVeterinario;
    private String fechaTratamiento;
    private double costo;

    public Tratamiento() {
    }

    public Tratamiento(String idTratamiento, String nombreTratamiento, Mascota idMascota, Veterinario idVeterinario, String fechaTratamiento, double costo) {
        this.idTratamiento = idTratamiento;
        this.nombreTratamiento = nombreTratamiento;
        this.idMascota = idMascota;
        this.idVeterinario = idVeterinario;
        this.fechaTratamiento = fechaTratamiento;
        this.costo = costo;
    }

    public String getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(String idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    public Mascota getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Mascota idMascota) {
        this.idMascota = idMascota;
    }

    public Veterinario getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Veterinario idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getFechaTratamiento() {
        return fechaTratamiento;
    }

    public void setFechaTratamiento(String fechaTratamiento) {
        this.fechaTratamiento = fechaTratamiento;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "idTratamiento=" + idTratamiento + ", nombreTratamiento=" + nombreTratamiento + ", idMascota=" + idMascota + ", idVeterinario=" + idVeterinario + ", fechaTratamiento=" + fechaTratamiento + ", costo=" + costo + '}';
    }

    public double calcularCostoTotal() {
        double costoBase = this.costo;
        double costoTotal = costoBase;

        if (costoBase > 200000) {
            double costoExtra = 50000;
            costoTotal += costoExtra;
        }

        if (costoBase > 30000) {
            double impuesto = costoBase * 0.16;
            costoTotal += impuesto;
        }

        return costoTotal;
    }

    public void evaluacionHospi() {
    
        if (costoTotal > 100000) {
            System.out.println("La mascota necesita hospitalización");
        } else {
            System.out.println("La mascota no necesita hospitalización");
        }
    }
}