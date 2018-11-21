/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class NotaMedia {
    // Variable
    private float nota;
    
    // Métodos Set y Get
    public void setNotaMedia(float nota){
        this.nota = nota;
    }
    public float getNotaMedia(){
        return nota;
    }
    
    // Pedir notas
    public int pedirNota(){
        int res;
        do{
        res = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota: "));
        }while(res<1 || res>10);
        return res;
    }

    // Notas teóricas
    public void notaTeoricas(){
        int cont, numNotas;
        float mediaTeoricas,suma = 0;
        numNotas = Integer.parseInt(JOptionPane.showInputDialog("Introduzaca el número de notas teóricas: "));
        
        for(cont = 0; cont<numNotas;cont++){
           nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzaca las notas teóricas: "));
           suma+=nota;
       }
        mediaTeoricas = suma/numNotas * 40 / 100; 
            
    }
    
    // Notas practicas
    public void notaPractica(){
        int cont, numNotas;
        float mediaPracticas,suma = 0;
        numNotas = Integer.parseInt(JOptionPane.showInputDialog("Introduzaca el número de notas prácticas: "));
        
        for(cont = 0; cont<numNotas;cont++){
           nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzaca las notas prácticas: "));
           suma+=nota;
       }
       mediaPracticas = suma/numNotas * 40 / 100; 
            
    }
        
    // Notas Boletines
    public void notaBoletin(){
        int cont, numBoletines;
        float mediaBoletines,boletinesCompletados, suma = 0;
        numBoletines = Integer.parseInt(JOptionPane.showInputDialog("Introduzaca el número de boletines: "));
        boletinesCompletados = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el número de boletines completados: "));
        mediaBoletines = boletinesCompletados/numBoletines*100;
        
        if(90<mediaBoletines){
            
        }
        else if(70<mediaBoletines){
            
        }
        else{
            
        }
    }
}
