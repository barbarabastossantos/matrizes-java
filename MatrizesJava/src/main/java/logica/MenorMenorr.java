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
public class MenorMenorr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] vect=new int[5];
        
        for(int i=0; i<vect.length;i++){
            System.out.println("Digite o "+(i+1)+" numero : ");
            vect[i]=sc.nextInt();
        }
        
        int maior=0;
        int menor=0;
        
         for(int i=0; i<vect.length;i++){
             if(i==0){
                 maior=vect[i];
                 menor=vect[i];
             }
             if(vect[i]>maior){
                 maior=vect[i];
             }
             if(vect[i]<menor){
                 menor=vect[i];
             }
         }
          
         System.out.println(" maior "+maior+ " menor "+ menor);
        
        sc.close();
    }
}
