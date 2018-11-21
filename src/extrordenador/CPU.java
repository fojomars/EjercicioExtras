/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrordenador;

/**
 *
 * @author fojomars
 */
public class CPU {
    private int nucleos;
    private int ram;
    
    //Constructor sin parámetros
    public CPU() {
    }

    //Constructor con parámetros
    public CPU(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;
    }
    
    // Setter y getter
    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    // Mostrar
    public String mostrar(){
        return "Núcleos: " + nucleos + "\nRam" + ram;
    }
}
