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
public class RegistroTemperaturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double[] vect= new double[7];
        
        for(int i=0;i< vect.length;i++){
            System.out.print(" Digite a temperatura do dia "+(i+1)+" -> ");
            vect[i]=sc.nextDouble();
            
        }
        
        double soma=0;
        double maior=vect[0];
        double menor=vect[0];
        
        for(int i=0;i< vect.length;i++){
            soma+=vect[i];
            if(vect[i]>maior){
                maior=vect[i];
            }
            if(vect[i]<menor){
                menor=vect[i];
            }
        }
        
        double media=soma/vect.length;
        
        System.out.println("maior temperatura "+ maior+" menor temperatura "+menor);
        System.out.printf("Media semanal %.2f%n",media);
        
        sc.close();
    }
}
