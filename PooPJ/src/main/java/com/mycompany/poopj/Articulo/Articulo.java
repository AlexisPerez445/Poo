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
public class Articulo {
    
    private String nombre;
    private double precio;
    private int tipo;
    private final double iva = 0.21;
    private final double iva2 = 0.10;
    private final double iva3 = 0.04;
    
    private int stock;
    
    public Articulo(String nombre, double precio,int tipo, int cuantosQuedan){
        
        if(nombre.equals("") || precio == 0 || tipo <= 0 || tipo >3){
            System.err.println("Datos incorrectos");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.tipo = tipo;
            this.stock = cuantosQuedan;
        }
    }
    /*GETTERS*/
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }
    
    /*SETTERS*/
    public void setNombre(String nombre){
        if(nombre.equals("")){
            System.err.println("Error");
        } else {
            this.nombre = nombre;
        }
        
    }
    public void setPrecio(double precio){
        if(precio != 0){
            this.precio = precio;
        } else {
            System.err.println("Error");
        }
    }
    public void setStock(int cantidad){
        if(precio != 0){
             this.stock = cantidad;
        } else {
            System.err.println("Error");
        }
    }
    
    /*METODOS UTILES*/
    public void imprimir(){
        System.out.println("Nombre " + nombre + " Precio: " + precio + " Stock " + stock);
    }
    public double getPVP(){
        double precio =0;
        switch(tipo){
            case 1: precio = (this.precio * iva) + this.precio;
            break;
            case 2: precio = (this.precio * iva2) + this.precio;
            break;
            case 3: precio = (this.precio * iva3) + this.precio;
            break;
        }
        return precio;
    }
    public double getDescuento(double descuento){
        double resultado = getPVP() - (getPVP()*descuento /100);
        return resultado;
    }
    public boolean vender(int x){
        if(x <= stock){
            stock-= x;
            return true;
        } else return false;
    } 
    public boolean almacenar(int x){
        stock += x;
        return true;
    }
}
