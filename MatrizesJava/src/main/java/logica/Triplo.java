/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Triplo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] vect=new int[8];
        int[] vect2=new int[8];
        int[] vect3= new int[8];
        
        for(int i=0;i< vect.length;i++){
            System.out.println("digite -> ");
            vect[i]=sc.nextInt();
        
        }
        
        System.out.println(" \n \n \n ");
        System.out.println(" original ");
         for(int i=0;i< vect.length;i++){
             System.out.print(vect[i]+" ");
         }
            
            System.out.println(" ");
        System.out.println(" A metade ");
        System.out.println(" ");
         for(int i=0;i< vect.length;i++){
             vect2[i]=vect[i]/2;
             System.out.print(vect2[i]+ " ");
         }
         System.out.println(" ");
        System.out.println(" o triplo ");
        System.out.println(" ");
         for(int i=0;i< vect.length;i++){
             vect3[i]=vect[i]*3;
             System.out.print(vect3[i]+" ");
         }
        
        sc.close();
    }
}
