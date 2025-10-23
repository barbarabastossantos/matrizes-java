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
public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] mat=new  int[3][2];
        int[][] mat2={
            {1,2},
            {3,4},
            {5,6},
        };
        
        for(int i=0;i<mat.length;i++){
            for(int j =0; j< mat[i].length;j++){
                System.out.println("Digite o numero da posicao ["+i+"]["+j+"]");
                mat[i][j]=sc.nextInt();
               
            }
        }
        
        int soma=0;
        System.out.println(" \n  Soma das matrizes mat e mat2 \n");
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                soma=mat[i][j]+mat2[i][j];
                System.out.print(soma+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" \n matriz mat \n ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        } 
        System.out.println(" \n matriz mat2 \n ");
         for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
               
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
