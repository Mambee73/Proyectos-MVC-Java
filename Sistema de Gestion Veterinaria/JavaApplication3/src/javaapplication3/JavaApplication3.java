/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author vina
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        
        Mascota pet1 = new Mascota("Dog001", "CatSlayer", "Labrador", "01/10/2001");
        Mascota pet2 = new Mascota("Cat001", "MataPajaros", "Amarillo", "02/12/2002");
        
        Veterinario vet1 = new Veterinario("Vet01", "Rodrigo", "Ubilla", "Cirugia General", "20/04/2024");
        Veterinario vet2 = new Veterinario("vet02", "Anais", "Lopez", "Ecocardiograma", "20/03/2024");
        
        Tratamiento trata1 = new Tratamiento("SECC001", "Endoscopia", pet2, vet1, "05/06/2025", 350000);
        Tratamiento trata2 = new Tratamiento("SECC02", "Enrofloxacina", pet1, vet2, "06/07/2025", 200000);
        
        
        System.out.println("---Veterinaria DuocUC----");
        System.out.println("Paciente: " + pet2.getNombre());
        System.out.println("Raza/Especie : " + pet2.getRaza());
        System.out.println("Profesional: " + vet1.getApellido()+" "+ vet1.getNombre());
        System.out.println("Especialidad: " + vet1.getEspecialidad());
        System.out.println("El costo total de la atencion es de:$ " + trata1.calcularCostoTotal());
        System.out.println("Observacion: " );
        System.out.println("------------------");
        System.out.println("Paciente: " + pet1.getNombre());
        System.out.println("Raza/Especie : " + pet1.getRaza());
        System.out.println("Profesional: " + vet2.getApellido()+" "+ vet2.getNombre());
        System.out.println("Especialidad: " + vet2.getEspecialidad());
        System.out.println("El costo total de la atencion es de:$ " + trata2.calcularCostoTotal());
        System.out.println("Observacion: " );
       
                
    }
    
}
