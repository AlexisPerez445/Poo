/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author Alex
 */
public class Main {

    public static void main(String[] args) {
        
        Reloj[] relojes = new Reloj[5];
        relojes[0] = new Reloj(12,52,18);
        relojes[1] = new Reloj(2,45,51);
        relojes[2] = new Reloj(14,14,36);
        relojes[3] = new Reloj(18,10,13);
        relojes[4] = new Reloj(22,5,10);
        
       /* 
        for (int i = 0; i < relojes.length; i++) {
            relojes[i].imprimeHora();
        }
        
        for (int i = 0; i < relojes.length; i++) {
            relojes[i].tick();
            relojes[i].imprimeHora();
        }
        
        for (int i = 0; i < relojes.length; i++) {
            for (int j = 0; j < 60; j++) {
                relojes[i].tick();
            }
            relojes[i].imprimeHora();
        }
        
        for (int i = 0; i < relojes.length; i++) {
            for (int j = 0; j < 3600; j++) {
                relojes[i].tick();
            }
            relojes[i].imprimeHora();
        }*/
       relojes[4].tick(30);
       relojes[4].imprimeHora();
    }
}
