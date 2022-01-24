/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaCorriente;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean salir = false, resultado;
        int opcion, cuenta,cuenta2;
        double dinero;
        
        CuentaCorriente[] cuentas = new CuentaCorriente[5];
        cuentas[0] = new CuentaCorriente(1,25);
        cuentas[1] = new CuentaCorriente(2,35);
        cuentas[2] = new CuentaCorriente(3,45);
        cuentas[3] = new CuentaCorriente(4,55);
        cuentas[4] = new CuentaCorriente(5,15);
        
        do {
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println("1. VER CUENTAS");
            System.out.println("2. INGRESAR");
            System.out.println("3. RETIRAR");
            System.out.println("4. TRANSFERENCIA");
            System.out.println("5. SALIR");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    for (int i = 0; i < cuentas.length; i++) {
                        cuentas[i].imprime();
                    }
                    break;
                case 2:
                    System.out.println("Dime la cuenta que quieres ingresar el dinero");
                    cuenta = teclado.nextInt() -1;
                    System.out.println("Dime la cantidad que quieres ingresar");
                    dinero = teclado.nextDouble();
                    cuentas[cuenta].ingresar(dinero);
                    cuentas[cuenta].imprime();
                    break;
                case 3:
                    System.out.println("Dime la cuenta que quieres retirar el dinero");
                    cuenta = teclado.nextInt() -1;
                    System.out.println("Dime la cantidad que quieres retirar");
                    dinero = teclado.nextDouble();
                    if(cuentas[cuenta].retirar(dinero)){
                        cuentas[cuenta].imprime();
                    } else {
                        System.err.println("Error: Saldo insuficiente");
                    }
                    break;
                case 4:
                    System.out.println("¿Cuanto dinero quieres transferir?");
                    dinero = teclado.nextDouble();
                    System.out.println("Dime la cuenta de origen");
                    cuenta = teclado.nextInt() -1;
                    System.out.println("Dime la cuenta de destino");
                    cuenta2 = teclado.nextInt() -1;
                    
                    if(cuenta != cuenta2){ 
                        if (cuentas[cuenta].retirar(dinero)) {
                            cuentas[cuenta2].ingresar(dinero);
                            cuentas[cuenta].imprime();
                            cuentas[cuenta2].imprime();
                        } else {
                            System.err.println("Error: Saldo insuficiente");
                        }     
                    } else {
                        System.err.println("Error Nº de cuentas iguales");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}
