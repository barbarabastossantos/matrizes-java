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
public class Dobro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] vect=new int[8];
        int[] vect2=new int[8];
        for(int i=0;i<vect.length;i++){
            System.out.println(" digite numero-> ");
            vect[i]=sc.nextInt();
        }
        System.out.println(" \n Vetor  ao dobro\n ");
        for(int i=0;i<vect.length;i++){
            vect2[i]=vect[i]*2;
            System.out.print(vect2[i]+"  ");
        }
        
        
        
        
        
        
        sc.close();
    }
}
