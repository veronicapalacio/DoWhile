/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author vpala
 */
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero= 90;
     
        Scanner numero1 = new Scanner (System.in);
        while( numero < 100 ){
        System.out.println ("escriba un #");
        numero = numero1.nextInt();
            System.out.println(numero);
  //       numero ++;
            
        }
        
    }
    
    
}
