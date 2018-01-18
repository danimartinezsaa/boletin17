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
public class MetodosArray{
    
        public void revertir(float array[]){
        float aux;
        int i,u;  
        for(i=0,u=array.length-1;i<array.length && u>0;i++,u--){
            aux=array[i];
            array[i]=array[u];
            array[u]=aux;
        }
    }
     
    public void mostrar(float array[]){
        for(float elemento: array)
            System.out.println(elemento);
    }
}
