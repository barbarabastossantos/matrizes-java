/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todosvizinhos;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class SomaVizinhos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int[][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        System.out.println(" Digite uma linha de 0 a 2 -> ");
        int i=sc.nextInt();
        System.out.println("Digite uma coluna de 0 a 2 -> ");
        int j=sc.nextInt();
        int soma=0;
         System.out.println(" Voce escolheu o numero -> "+ mat[i][j]);
        
        if(i-1>=0){
            System.out.println("Vizinho de cima -> "+mat[i-1][j]);
            soma+=mat[i-1][j];
        }else{
            System.out.println(" nao tem vizinho de cima  ");
        }
        
        if(i+1<mat.length){
          soma+=mat[i+1][j];
            System.out.println("Vizinho de baixo -> "+ mat[i+1][j]);
        }else{
            System.out.println(" Nao tem vizinho de baixo");
        }
        
        if(j-1>=0){
           soma+=mat[i][j-1];
            System.out.println("Vizinho da esquerda -> "+ mat[i][j-1]);
        }else{
            System.out.println(" Nao tem vizinho da esquerda");
        }
        
        if(j+1< mat[i].length){
            soma+=mat[i][j+1];
            System.out.println(" Vizinho da direita -> "+ mat[i][j+1]);
        }else{
            System.out.println(" nao tem vizinho da direita");
        }
           System.out.println(" A soma dos vizinhos e -> "+ soma); 
        
     sc.close();
    }
}
