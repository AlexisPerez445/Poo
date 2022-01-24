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
public class Main {
    public static void main(String[] args) {
        Asignatura[] r1 = new Asignatura[5];
        r1[0] = new Asignatura("Mates",10,1);
        r1[1] = new Asignatura("Ingles",9,1);
        r1[2] = new Asignatura("Sociales",8,1);
        r1[3] = new Asignatura("Ingles",7,1);
        r1[4] = new Asignatura("Castellano",6,1);
        for(int i=0; i<r1.length;i++ ){
            r1[i].imprimir();
        }
    }
}
