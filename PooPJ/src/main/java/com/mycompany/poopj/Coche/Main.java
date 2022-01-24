/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

import java.util.Scanner;

/**
 *
 * @author a0y1959744c
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Coche[] c1 = new Coche[3];
        
        /*CREAR LOS 3 TIPOS DE COCHES*/
        for(int i=0; i<c1.length; i++){
            System.out.println("Dime el modelo del coche");
            teclado.nextLine();
            String nombre = teclado.nextLine();
            System.out.println("Dime el color del coche");
            String color = teclado.nextLine();
            System.out.println("Pintura metalizada (true) o (false)");
            boolean pintura = teclado.nextBoolean();
            System.out.println("Dime la matrícula del coche");
            teclado.nextLine();
            String matricula = teclado.nextLine();
            System.out.println("Dime el tipo del coche(1=MINI, 2=UTILITARIO, 3=FAMILIAR, 4=DEPORTIVO)");   
            int tipo = teclado.nextInt();
            tipoCoche d = null;
            switch (tipo) {
                case 1:
                    d = tipoCoche.MINI;
                    break;
                case 2:
                    d = tipoCoche.UTILITARIO;
                    break;
                case 3:
                    d = tipoCoche.FAMILIAR;
                    break;
                case 4:
                    d = tipoCoche.DEPORTIVO;
                    break;
            }
            System.out.println("Dime el tipo del seguro(1=TERCEROS, 2=A TODO RIESTO)");   
            int seguro = teclado.nextInt();
            seguroModo s = null;
            switch (seguro) {
                case 1:
                    s = seguroModo.TERCEROS;
                    break;
                case 2:
                    s = seguroModo.TODO_RIESGO;
                    break;
            }
            System.out.println("Dime el año del coche");
            int año = teclado.nextInt();
            c1[i] = new Coche(nombre, color, pintura,matricula, d, s, año);
        }
        
        /*IMPRIMIR POR PANTALLA LA INFORMACION DE LOS COCHES*/
        for(int i=0; i<c1.length;i++){
            c1[i].imprimir();
        }
        /*MOSTRAR CUANTOS COCHES TIENEN PINTURA METALIZADA*/
        int metalizada =0;
        for(int i=0; i<c1.length;i++){
            if(c1[i].getPintura()){
                metalizada+=1;
            }
        }
        System.out.println(metalizada + " Coches tienen la pintura metalizada");
        
        /*MOSTRAR COCHES FABRICADOS ANTES DEL 2000*/
        int fabricacion =0;
        for(int i=0; i<c1.length;i++){
            if(c1[i].getAño()<2000){
                fabricacion+=1;
            }
        }
        System.out.println(metalizada + " Coches fueron fabricados antes del 2000");
        
        /*MOSTRAR COCHES CON SEGURO TODO RIESGO Y A TERCEROS*/
        int terceros = 0;
        int todoRiesgo = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i].getSeguro().equals(seguroModo.TERCEROS)) {
                terceros += 1;
            } else{
                todoRiesgo+=1;
            }
        }
        System.out.println(terceros + " Coches tienen el seguro a terceros y " + todoRiesgo + " Coches tienen seguro a todo riesgo" );
    }
}
