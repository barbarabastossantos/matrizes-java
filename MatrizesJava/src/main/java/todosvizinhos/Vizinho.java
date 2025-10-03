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
public class Vizinho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[][]mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        System.out.println(" Digite uma linha de 0 a 2 -> ");
        int i=sc.nextInt();
        System.out.println(" Digite uma coluna de 0 a 2 -> ");
        int j=sc.nextInt();
        
        System.out.println(" Voce escolheu o numero -> "+ mat[i][j]);
        if(i-1>=0){
            System.out.println(" O vizinho de cima e -> "+ mat[i-1][j]);
        }else {
            System.out.println("Nao tem vizinho de cima  ");
        }
        
        if(i+1<mat.length){
            System.out.println(" O vizinho de baixo e -> "+ mat[i+1][j]);
        }else{
            System.out.println(" Nao tem vizinho de baixo");
        }
        
        if(j-1>=0){
            System.out.println(" O vizinho da esquerda e -> "+ mat[i][j-1]);
        }else{
            System.out.println(" Nao tem vizinho da esquerda ");
        }
        
        if(j+1<mat[i].length){
            System.out.println(" O vizinho da direita e -> "+ mat[i][j+1]);
        }else{
            System.out.println(" Nao tem vizinho da direita");
        }
        
        System.out.println(" ");
        for(int ii=0;ii<mat.length;ii++){
            for(int jj=0;jj< mat[ii].length;jj++){
                System.out.print(mat[ii][jj]+ " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
