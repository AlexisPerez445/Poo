/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Scanner;

/**
 *
 * @author a0y1959744c
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Persona pers1 = new Persona("51274544g", "ALex","perez",25);
        Persona pers2 = new Persona("44947514g", "Andres", "garcia", 35);
        
      
        System.out.println("Persona1 " + pers1.getNombre() + " " + pers1.getApellidos() + " " + pers1.getEdad() + " " + pers1.getDni());
        System.out.println("La diferencia es " + pers2.diferenciaEdad(pers1));
       
    }
}
