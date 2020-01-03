/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner baca = new Scanner(System.in);
    float c,r,f,k;
    System.out.print("Celcius = "); c=baca.nextFloat();
    r = 4/5f*c;
    f = 9/5f*c+32;
    k = 273+c;
    System.out.println("Celcius = "+c);
    System.out.println("Reamur = "+r);
    System.out.println("Farenheit = "+f);
    System.out.println("Kelvin = "+k);
    
    }
    
}
