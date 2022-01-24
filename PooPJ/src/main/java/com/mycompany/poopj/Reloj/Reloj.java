/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author Alex
 */
public class Reloj {
    private int hora, minutos, segundos;
    
    /*CONSTRUCTORES*/
    public Reloj(){
        hora= 0;
        minutos= 0;
        segundos= 0;
    }
    public Reloj(int hora, int minutos, int segundos){
            setHora(hora);
            setMinutos(minutos);
            setSegundos(segundos);
    }
    
    /*GETTERS*/
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }
    
    /*SETTERS*/
    public void setHora(int hora){
        if(hora < 24 || hora >= 0){
            this.hora = hora;
        } else {
            System.err.println("Error");
        }
    }
    public void setMinutos(int minutos){
        if(minutos <= 59 || minutos >= 0){
            this.minutos= minutos;
        } else {
            System.err.println("Error");
        }
    }
    public void setSegundos(int segundos){
        if(segundos <= 59 || segundos >= 0){
            this.segundos= segundos;
        } else {
            System.err.println("Error");
        }
    }
    public void setReloj(int hora, int minutos, int segundos){
            setHora(hora);
            setMinutos(minutos);
            setSegundos(segundos);
    }
    
    /*METODOS*/
    public String dimeHora(){
        return hora+":"+minutos+":"+segundos;
    }
    public String dimeHora12(){
        return hora12(hora)+ ":" + minutos+ ":"+ segundos;
    }
    public void imprimeHora(){
        System.out.println(dimeHora());
    }
    public void imprimeHora12(){
        System.out.println(dimeHora12());
    }
    public void tick() {
        segundos++;
        if(segundos == 60){
            segundos =0;
            minutos++;
        }
        if(minutos == 60){
            minutos =0;
            hora++;
        }
        if(hora == 24) {
            hora = 0;
        }
    }
    public void tick(int s){
        for (int i = 0; i < s; i++) {
            tick();
        }
    }
    /*PASAR LAS HORAS EN FORMATO DE 12 HORAS*/
    private String hora12(int hora) {
        int horaN = hora - 12;
        if (horaN < 0) {
            return String.valueOf(hora) + "AM";
        } else if (horaN == 12) {
            return String.valueOf(horaN) + "AM";
        } else if (horaN == 0) {
            return String.valueOf(hora) + "PM";
        } else {
            return String.valueOf(horaN) + "PM";
        }
    }
}
