/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_3;

/**
 *
 * @author dani
 */
public class Boletin17_3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MetodosArray m=new MetodosArray();
        float notas[]=new float[5];
        String nombre[]={"Dani","Jose","Pablo","Alejandro","Alberto"};
        float notas_orden[]=new float[5];
        
        for(int i=0;i<notas.length;i++){
            notas[i]=(float)Math.random()*9+0;
        }
        
        m.mostrar(notas, nombre);
        m.mostrarAprobados(notas, nombre);
        notas_orden=m.ordenar(notas);
        m.mostrarArray(notas_orden);
    }
    
}
