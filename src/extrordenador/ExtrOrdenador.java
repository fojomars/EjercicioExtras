/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class ExtrOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenador obx = new Ordenador();
        obx.setCPU(8, 16);
        obx.setMonitor("LG", 18);
        obx.setRaton(true, "Logitech");
        obx.setTeclado(60);
        JOptionPane.showMessageDialog(null, obx.visualizarAtributos());
        JOptionPane.showMessageDialog(null, obx.calcularPrecio());
        
        
        

        
    }
    
}
