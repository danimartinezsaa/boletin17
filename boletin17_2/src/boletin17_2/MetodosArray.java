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
public class MetodosArray{

    public int mostrarAprobados(Alumno array[]){
        int aprobados=0;
        for(int i=0;i<array.length;i++){
            if(array[i].getNota()>=5f){
                aprobados++;
            } 
        }
        return aprobados;
    }
    
    public float mostrarMedia(Alumno array[]){
        float var=0;
        for(int i=0;i<array.length;i++){
            var=var+array[i].getNota();
            }
        var=var/array.length;
        return var;
    }
    
    public float mostrarNotaAlta(Alumno array[]){
        float var=0;
        for(int i=0;i<array.length;i++){
            if(array[i].getNota()>var){
                var=array[i].getNota();
            }
        }
        return var;
    }    
    
}
