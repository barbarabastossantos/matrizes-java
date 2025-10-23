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
public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[][] mat=new int[2][3];
       int[][] mat2=new int[3][2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                
                System.out.print("Digite o numero da posicao  ["+i+"]["+j+"]");
                mat[i][j]=sc.nextInt();
            }
           
        }
        
        System.out.println(" \n matriz transposta \n ");
        
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
              mat2[j][i]=mat[i][j];
            
            }
          
        }
        System.out.println("\n  Matriz original \n ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
             
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println(" \n Matriz transposta \n ");
       
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
             
                System.out.print(mat2[i][j]+ " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
