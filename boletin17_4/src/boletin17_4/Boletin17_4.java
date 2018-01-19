/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Boletin17_4{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String insert=JOptionPane.showInputDialog("Inserte DNI");
        double dni=(Double.parseDouble(insert))%23;
        
        Character letra[]={'A','B','C','D','E','F','G','H','J','K','L','M','N','P','R','S','T','V','W','X','Y','Z'};
        int numero[]={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
        
        MetodosArray m=new MetodosArray();
        m.encontrar(dni, letra, numero);
    }
    
}
