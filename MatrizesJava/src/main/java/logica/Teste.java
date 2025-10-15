/*O
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Teste {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc=new Scanner(System.in);
         
         double[] vect=new double[6];
         
         for(int i=0; i< vect.length;i++){
             System.out.println(" digite o "+(i+1)+ " numero ");
             vect[i]=sc.nextDouble();
         }
         System.out.println("==================\n  O  10.0 aparece nas posicoes \n================");
         for(int i=0;i<vect.length;i++){
             if( vect[i]==10.0){
                 System.out.println("-> "+i);
             }
         }
         
         
         
         sc.close();
    }
}
