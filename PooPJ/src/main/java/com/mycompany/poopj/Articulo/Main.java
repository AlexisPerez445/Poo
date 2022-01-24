/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulo;

/**
 *
 * @author a0y1959744c
 */
public class Main {
    
    public static void main(String[] args) {
        Articulo a1 = new Articulo("Agua",14, 2, 5);
        a1.imprimir();
        System.out.println("El precio + IVA " + a1.getPVP());
        System.out.println("Un descuento del 20% " + a1.getDescuento(50.0)); 
    }
    
}
