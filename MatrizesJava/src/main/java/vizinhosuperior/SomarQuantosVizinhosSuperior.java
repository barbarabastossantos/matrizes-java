/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizinhosuperior;

/**
 *
 * @author ADM
 */
public class SomarQuantosVizinhosSuperior {
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
    };
        int soma=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0; j< mat[i].length;j++){
              if(i-1>=0){
                    soma+= mat[i-1][j];
              }
            }
        }
        
            for(int i=0;i<mat.length;i++){
            for(int j=0; j< mat[i].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
                System.out.println(" ");
        }            
        System.out.println(" \n A soma dos vizinhos de cima  e ->  "+ soma);
        
        
    }
}
