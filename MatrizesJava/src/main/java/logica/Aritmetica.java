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
public class Aritmetica {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int[] vect=new int[5];
         int[] vect2=new int[5];
         System.out.println(" vetor A \n");
         for(int i=0;i<5;i++){
             System.out.println("digite -> ");
             vect[i]=sc.nextInt();
         }
         
         System.out.println(" \n vetor B \n");
         for(int i=0;i<5;i++){
             System.out.println("digite -> ");
             vect2[i]=sc.nextInt();
         }
         
         int[] soma=new int[5];
         System.out.println(" \n vetor Soma \n ");
         for(int i=0;i<5;i++){
             soma[i]=vect[i]+vect2[i];
             System.out.print(soma[i]+" ");
         }
         
         int[] dif=new int[5];
         
         System.out.println(" \n vetor da diferenca \n ");
         
         for(int i=0;i<5;i++){
             dif[i]=vect[i]-vect2[i];
             
             System.out.print(dif[i]+ " ");
         }
         sc.close();
    }
}