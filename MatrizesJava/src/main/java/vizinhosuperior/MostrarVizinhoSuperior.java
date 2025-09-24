/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizinhosuperior;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class MostrarVizinhoSuperior {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] mat= new int[3][3];
        
        for(int i=0;i< mat.length;i++){
            for(int j=0; j< mat[i].length;j++){
                System.out.println("Digite um numero na posicao ["+i+"]["+j+"] -> ");
                mat[i][j]=sc.nextInt();
            }
        }
        
        System.out.println(" \n Digite uma linha de 0 a 2 -> ");
        int i=sc.nextInt();
        System.out.println(" \n Digite uma coluna de 0 a 2 -> ");
        int j=sc.nextInt();
        
        System.out.println("Seu numero escolhido foi -> "+ mat[i][j]);
   
        if(i-1>=0){
            System.out.println("Vizinho de cima -> "+ mat[i-1][j]);
        }else{
            System.out.println(" Nao tem vizinho de cima!");
        }
        
        System.out.println("\n Matriz \n ");
        
        
        for(int ii=0;ii< mat.length;ii++){
            for(int jj=0;jj< mat[ii].length;jj++){
                System.out.print(mat[ii][jj]+" ");
            }
            System.out.println(" ");
        }
        
        sc.close();
    }
            
}
