/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

/**
 *
 * @author a0y1959744c
 */
public class Asignatura {
    private String nombre;
    private int codigo,curso;
    
    /*CONSTRUCTOR*/
    public Asignatura(String nombre, int codigo, int curso){
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }
    
    /*GETTERS*/
    public String getNombre(){
        return nombre;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getCurso(){
        return curso;
    }
    
    /*SETTERS*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setCurso(int curso){
        this.curso = curso;
    }
    
    /*OTROS METODOS*/
    public void imprimir(){
        System.out.println("Nombre " + nombre + " código " + codigo + " curso " + curso);
    }
}
