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
public class Pares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vect=new int[10];
        
        for(int i=0;i< vect.length;i++){
            System.out.println("Digite o "+(i+1)+ " numero -> ");
            vect[i]=sc.nextInt();
        }
        
        for(int i =0;i< vect.length;i++){
          if(vect[i]%2==0){
              System.out.println("numeros pares "+ vect[i]);
          }
        }
        
        sc.close();
        
        
    }
}
