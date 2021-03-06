/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto;

/**
 *
 * @author a0y1959744c
 */
public class Punto {
    private int x;
    private int y;
    
    /*CONSTRUCTORES*/
    public Punto(){
        x=0;
        y=0;
    }
    public Punto(int x, int y){
        this.x = x;
        this.y= y;
    }
    
    /*SETTERS*/
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setCoordenadas(int x, int y){
        setX(x);
        setY(y);
    }
    
    /*GETTERS*/
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void imprime(){
        System.out.println("(" + x+","+ y +")");
    }
    public void desplaza(int dx, int dy){
        setX(x + dx);
        setY(y +=dy);
    }
    
    public double distancia (Punto p){
        double d = Math.sqrt((((p.x -  this.x)*(p.x -  this.x)) + ((p.y - this.y)*(p.y - this.y)) ));
        return d;
    }
    public static Punto creaPunto(){
        Punto punto1 = new Punto((int)Math.floor(Math.random()*(-100-100)+100),(int)Math.floor(Math.random()*(-100-100)+100));
        return punto1;
    }
    public String getXY(){
        return x + " " + y;
    }
}
