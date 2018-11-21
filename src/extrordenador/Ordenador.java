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
public class Ordenador {
    CPU procesador;
    Rato raton;
    Teclado obxTeclado;
    Monitor obxMonitor;
    
    //Constructor con parametros
    public Ordenador(){
        procesador = new CPU();
        raton = new Rato();
        obxTeclado = new Teclado();
        obxMonitor = new Monitor();
    }
    
    // Setters y Getters

    public void setCPU(int nucleos, int ram) {
        procesador.setNucleos(nucleos);
        procesador.setRam(ram);
        
    }

    public void setRaton(boolean inalambrico, String modelo){
        raton.setInalambrico(inalambrico);
        raton.setModelo(modelo);
    }
    public void setTeclado(int numTeclas){
        obxTeclado.setNumTeclas(numTeclas);
    }
    public void setMonitor(String marca, float pulgadas){
        obxMonitor.setMarca(marca);
        obxMonitor.setPulgadas(pulgadas);
    }

    
    // Mostrar atributos
        public String visualizarAtributos(){
        return procesador.mostrar() + "\n" + raton.mostrar() 
        + "\n" + obxTeclado.mostrar() + "\n" + obxMonitor.mostrar(); 
    }
    //Cálculo del precio según ciertas características
    public double calcularPrecio(){
        double precio = procesador.getRam()*5 + obxTeclado.getNumTeclas()*0.7 + obxMonitor.getPulgadas()*12;
        if(raton.isInalambrico()== true){
            return Math.round(precio * 1.5);
        }
        else{
            return Math.round(precio);
        }
    }    
}
