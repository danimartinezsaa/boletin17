/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

/**
 *
 * @author dani
 */
public class Boletin17_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MetodosArray m=new MetodosArray();
        
        float numeros[]=new float[6];
        for(byte i=0;i<numeros.length;i++){
            numeros[i]=(float)Math.random()*50+1;
        }
        
        m.revertir(numeros);
        m.mostrar(numeros);
    }
    
}
