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
public class Alumno{
    private String nombre;
    private float nota;

    public Alumno(){
    }

    public Alumno(String nombre, float nota){
        this.nombre=nombre;
        this.nota=nota;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public float getNota(){
        return nota;
    }

    public void setNota(float nota){
        this.nota=nota;
    }

    @Override
    public String toString(){
        return "nombre: "+nombre+", nota: "+nota;
    }
    
    
}
