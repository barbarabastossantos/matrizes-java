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
public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] vect=new int[10];
        
        for(int i=0;i<10;i++){
            System.out.println("Digite o "+(i+1)+" numero ");
            vect[i]=sc.nextInt();
        }
        
        int menor=0;
        int maior=0;
         for(int i=0;i<10;i++){
            if(i==0) {
                menor=vect[i];
                maior=vect[i];
            }else{
                if(vect[i]>maior){
                    maior=vect[i];
                }
                if(vect[i]<menor){
                    menor=vect[i];
                }   
                
            }
         }
        
         System.out.println(" maior "+maior+" \n menor "+menor);
        
        
        sc.close();
    }
}
