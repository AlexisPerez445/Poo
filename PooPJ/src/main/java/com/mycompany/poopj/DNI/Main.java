/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DNI;

/**
 *
 * @author Alex
 */
public class Main {
    
    public static void main(String[] args) {
        DNI[] dn = new DNI[10000];
        int a=0,e=0,i=0,o=0,u=0;
        
        for (int j = 0; j < dn.length; j++) {
            dn[j]= DNI.newRamdomDNI();
            
            if (dn[j].getLetra() == 'A') {
                a++;
            }
            if (dn[j].getLetra() == 'E') {
                e++;
            }
            if (dn[j].getLetra() == 'I') {
                i++;
            }
            if (dn[j].getLetra() == 'O') {
                o++;
            }
            if (dn[j].getLetra() == 'U') {
                u++;
            }
        }
        for (int j = 0; j < dn.length; j++) {
            dn[j].imprime();
        }

        System.out.println("LETRA A " + a );
        System.out.println("LETRA E " + e );
        System.out.println("LETRA I " + i );
        System.out.println("LETRA O " + o );
        System.out.println("LETRA U " + u );
    }
}
