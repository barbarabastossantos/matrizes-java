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
public class Idade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] idade= new int[5];
        String[] nome= new String[5];
        
        for(int i=0;i<5;i++){
            System.out.println("Digite o nome da pessoa  de numero "+(i+1)+" : ");
            nome[i]=sc.nextLine();
            
            System.out.println("Digite a idade de "+ nome[i]+" : ");
            idade[i]=sc.nextInt();
            sc.nextLine();
        }
        
        for(int i=0;i<5;i++){
            if(idade[i]>=18){
                System.out.println(nome[i]+" e maior de idade pois tem  "+idade[i]+ " anos");
            }
        }
        
        
        sc.close();
    }
}
