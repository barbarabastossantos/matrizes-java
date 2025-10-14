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
public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        String[] nomes=new String[5];
        double[] notas=new double[5];
        
        double soma=0;
        for(int i=0;i<5;i++){
            System.out.println("Digite o nome do aluno e a nota");
            nomes[i]=sc.nextLine();
            notas[i]=sc.nextDouble();
            sc.nextLine();
            
        }
        System.out.println("Alunos que tirarm media  maior ou igual a 7");
        
        for(int i=0;i<5;i++){
            if(notas[i]>=7){
                System.out.println(" O aluno "+ nomes[i]+" tirou a nota "+ notas[i]);
            }
        }
        sc.close();
    }
}
