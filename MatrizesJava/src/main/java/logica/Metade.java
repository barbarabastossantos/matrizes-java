/*
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
public class Metade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double[] vect=new double[8];
        double[] vect2=new double[8];
        
        for(int i=0;i<vect.length;i++){
            System.out.println("->>  ");
            vect[i]=sc.nextDouble();
            
        }
        System.out.println(" \n novo vetor \n  ");
        
        for(int i=0;i<8;i++){
           vect2[i]=vect[i]/2; 
           
            System.out.print(vect2[i]+ " ");
        }
        
        
        
        
        sc.close();
    }
}
