/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

/**
 *
 * @author a0y1959744c
 */

enum tipoCoche{
    MINI, UTILITARIO, FAMILIAR, DEPORTIVO
}
enum seguroModo{
    TERCEROS, TODO_RIESGO
}
public class Coche {
    private String modelo, color, matricula;
    private tipoCoche tipo;
    private seguroModo seguro;
    int año;
    private boolean pintura;
    
    public Coche(String modelo, String color, boolean pintura, String matricula, tipoCoche tipo,seguroModo seguro, int año){
        this.modelo = modelo;
        this.color = color;
        this.pintura = pintura;
        this.matricula = matricula;
        this.tipo = tipo;
        this.seguro = seguro;
        this.año= año;
    }
    
    /*GETTERS*/
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public boolean getPintura(){
        return pintura;
    }
    public String getMatricula(){
        return matricula;
    }
    public tipoCoche getTipo(){
        return tipo;
    }
    
    public seguroModo getSeguro(){
        return seguro;
    }
    public int getAño(){
        return año;
    }
    
    /*SETTERS*/
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color= color;
    }
    public void setPintura(boolean pintura){
        this.pintura = pintura;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setTipo(tipoCoche tipo){
        this.tipo = tipo;
    }
    public void setSeguro(seguroModo seguro){
        this.seguro = seguro;
    }
    public void setAño(int año){
        this.año = año;
    }
    private String getColorM(){
        if(pintura){
            return "Metalizada";
        } else {
            return "No metalizada";
        }
    }
        public void imprimir(){
        System.out.println(modelo + " " + color + " " + getColorM() + " " + matricula + " " + tipo + " " + seguro + " " + año);
    }
}
