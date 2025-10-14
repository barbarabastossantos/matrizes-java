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
public class Somaa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vect=new int[8];
        
        System.out.println("Voce digitara 8 numeros");
        
        for(int i=0;i<vect.length;i++){
            System.out.println("Digite o "+ (i+1)+" numero ");
            vect[i]=sc.nextInt();
        }
        int soma=0;
        for(int i=0;i<vect.length;i++){
           if(vect[i]<0){
               soma+=vect[i];
           } 
        }
         System.out.println("A soma dos numeros negativos foi "+soma);
        
        
        sc.close();
        
        
        
    }
}
