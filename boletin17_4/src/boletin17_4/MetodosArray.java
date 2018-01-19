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
public class MetodosArray{
    public void encontrar(double dni,Character letra[],int numero[]){
        for(int i=0;i<numero.length;i++){
            if(dni==numero[i]){
                JOptionPane.showMessageDialog(null,"La letra es: "+letra[i]);
                break;
            }
           
        }
    }
}
