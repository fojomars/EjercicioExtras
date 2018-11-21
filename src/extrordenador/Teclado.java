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
public class Teclado {
    // Variables
    private int numTeclas;
    
    // Constructor por defecto
    public Teclado() {
    }

    // Constructor con parámetros
    public Teclado(int numTeclas) {
        this.numTeclas = numTeclas;
    }    
    
    // Setters y Getters
    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }
    
    // Mostrar
    public String mostrar(){
        return "Teclas: " + numTeclas;
    }


}
