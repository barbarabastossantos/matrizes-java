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
public class SomaMenorMaiorr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int soma=0;
         int maior=0; 
         int menor=0;
        
        for(int i=0;i<5;i++){
            System.out.print("Digite o numero "+(i+1)+" -> ");
            int x=sc.nextInt();
            
           soma+=x;
           
           if(i==0){//se for primeira vez do laco
               maior=x;
               menor=x;
           }else{
               if(x>maior){
                   maior=x;
               }else if(x<menor){
                   menor=x;
               }
           }
        }
        System.out.println(" Soma -> "+soma+" \n Maior -> "+maior+" \n Menor -> "+menor);    
        
        sc.close();
    }
            
}
