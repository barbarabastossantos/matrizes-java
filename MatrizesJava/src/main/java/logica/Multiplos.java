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
public class Multiplos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] vect=new int[12];
        
        for(int i=0;i< vect.length;i++){
            System.out.println("Digite o "+(i+1)+" numero ");
            vect[i]=sc.nextInt();
        }
        
        int multiplos=0;
        System.out.println(" ");
        for(int i=0;i<vect.length;i++){
            if(vect[i]%5==0 || vect[i]%3==0){
                multiplos++;
                System.out.print(vect[i]+" , ");
            }
        }
        
        System.out.println("\n Multiplos de 5 ou 3 tem "+ multiplos);
        sc.close();
    }
}
