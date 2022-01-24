/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author a0y1959744c
 */
public class Persona {
    
    private final String dni;
    static final int mayoriaEdad = 18;
    private String nombre;
    private String apellidos;
    private int edad;
    
    /*CONSTRUCTOR*/
    public Persona(String dni, String nombre, String apellidos, int edad){
        if(validarDNI(dni)){
            this.dni = dni;
        } else {
            this.dni = "Vacio";
            System.err.println("Error de DNI");
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    /*GETTERS*/
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }

    /*SETTERS*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    /*METODOS UTILES*/
    public void imprime(){
        System.out.println(dni + " " + nombre + " " + apellidos + " " + edad);
    }
    
    public boolean esMayorEdad(){
        boolean mayor = false;
        if (edad >= mayoriaEdad){
            mayor = true;
        } 
        return mayor;
    }
    
    public boolean esJubilado(){
        boolean jubilado = false;
        if (edad>=65){
            jubilado = true;
        }
        return jubilado;
    }
    
    public int diferenciaEdad(Persona p){
        int diferencia =0;
        diferencia = this.edad - p.edad;
        return diferencia;
    }
    
    public static boolean validarDNI(String dni){
        String num = dni.substring(0, (dni.length() - 1));
        char letra = dni.charAt(dni.length());
        int numeros;
        if (dni.length() == 9 ) {
            try {
                numeros = Integer.parseInt(num);
                return true;
            } catch (Exception e) {
                return false;
            }
        } return false;
    }
}
