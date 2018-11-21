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
public class Rato {
    // Valiables
    private boolean inalambrico;
    private String modelo;
    
    // Constructor por defecto
    public Rato() {
    }
    
    // Contructor con parámetros
    public Rato(boolean inalambrico, String modelo) {
        this.inalambrico = inalambrico;
        this.modelo = modelo;
    }    
    
    // Setters y getters
    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }    
    
    // Mostrar
    public String mostrar(){
        if(inalambrico = true){
            return "Inalambrico: Sí\nModelo: " + modelo;
        }    
        else{
            return "Inalámbrico: No\nModelo: " + modelo;
        }    
    }

}
