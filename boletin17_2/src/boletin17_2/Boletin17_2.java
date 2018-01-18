/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

/**
 *
 * @author dani
 */
public class Boletin17_2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MetodosArray m=new MetodosArray();
        Alumno alumnos[]=new Alumno[30];
        for(int i=0;i<alumnos.length;i++){
            alumnos[i]=new Alumno();
            alumnos[i].setNota((float)Math.random()*9+0);
        }
        
        System.out.println("Número de aprobados: "+m.mostrarAprobados(alumnos));
        System.out.println("Nota media: "+m.mostrarMedia(alumnos));
        System.out.println("Nota más alta: "+m.mostrarNotaAlta(alumnos));
    }
    
}
