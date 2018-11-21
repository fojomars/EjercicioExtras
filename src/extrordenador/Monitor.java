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
public class Monitor {
    private String marca;
    private float pulgadas;  
    
    // Constructor por defecto
    public Monitor() {
    }
    
    // Constructor con parámetros
    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }
    
    
    // Setters y Getters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    
    // Mostrar
    public String mostrar(){
        return "Marca: " + marca + "\nPulgadas" + pulgadas;
    }    
}
