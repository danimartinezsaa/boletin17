/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class MetodosArray{
    
    public void mostrar(float nota[], String nombre[]){
        String alumno=JOptionPane.showInputDialog("Inserte nombre del alumno");
        for(int i=0;i<nombre.length;i++){
            if(alumno.equalsIgnoreCase(nombre[i])){
                JOptionPane.showMessageDialog(null, "La nota es: "+nota[i]);
                break;
            }
        }
    }
    public void mostrarAprobados(float nota[], String nombre[]){
        int aprobados=0;
        for(int i=0;i<nota.length;i++){
            if(nota[i]>=5f){
                System.out.println("Aprobado: "+nombre[i]);
            } 
        }
    }
    public float[] ordenar(float notas[]){
        float array[]=new float[notas.length];
        for(int i=0;i<array.length;i++){
            array[i]=notas[i];
        }
        
        int j;
        float aux;
        for(int i=0;i<array.length-1;i++){
            for(j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }
    
    public void mostrarArray(float array[]){
        for(byte i=0;i<array.length;i++){
            System.out.println("temperatura "+(i+1)+": "+array[i]);
        }
    }
}
