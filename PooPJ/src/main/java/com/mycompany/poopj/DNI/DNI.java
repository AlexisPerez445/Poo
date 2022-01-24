/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DNI;

/**
 *
 * @author Alex
 */
public class DNI {
    private int dni;
    private final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    public DNI(int dni){
        this.dni = dni;
    }
    /*SETTER*/
    public void setDNI(int dni){
        if(String.valueOf(dni).length() == 8){
            this.dni = dni;
        } else System.err.println("Error");
    }
    
    /*GETTERS*/
    public int getDNI(){
        return dni;
    }
    public char getLetra(){
        return letras.charAt(dni % 23);
    }
    public String getNIF(){
        return String.valueOf(dni)+String.valueOf(getLetra());
    }
    /*METODO IMPRIMIR*/
    public void imprime(){
        System.out.println(getNIF());
    }
    
    public static DNI newRamdomDNI(){
        DNI d1 = new DNI( (int)(10000000 + Math.random() * (9999999-100000+1)));
        return d1;
    }
}
