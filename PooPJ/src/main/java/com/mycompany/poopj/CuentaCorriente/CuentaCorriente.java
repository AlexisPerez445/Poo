/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaCorriente;

/**
 *
 * @author Alex
 */
public class CuentaCorriente {
    private int num_cuenta;
    private double saldo;
    
    /*CONSTRUCTOR*/
    public CuentaCorriente(int num_cuenta, double saldo){
        this.num_cuenta = num_cuenta;
        if(esNegativo(saldo)){
            System.err.println("Error");
        } else {
            this.saldo= saldo;
        }
    }
    
    /*GETTERS*/
    public int getCuenta(){
        return num_cuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    
    /*SETTERS*/
    public void setNUMCUENTA(int num_cuenta){
        this.num_cuenta= num_cuenta;
    }
    public void setSaldo(double saldo){
        if(esNegativo(saldo)){
            System.err.println("Error");
        } else {
            this.saldo = saldo;
        }
    }
    
    /*MÉTODOS*/
    public void ingresar(double dinero){
        if(esNegativo(dinero)){
            System.err.println("Error");
        } else {
            this.saldo+=dinero;
        }
    }
    public boolean retirar(double dinero){
        if(esNegativo(dinero) || dinero >saldo){
            return false;
        } else {
            this.saldo-=dinero;
            return true;
        }
    }
    public void imprime() {
        System.out.println("Nº Cuenta: " + num_cuenta + "   Saldo: " + saldo);
    }
    
    private boolean esNegativo(double num){
        if(num < 0){
            return true;
        } else return false;
    }
}
