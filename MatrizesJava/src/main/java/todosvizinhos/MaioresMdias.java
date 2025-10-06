/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todosvizinhos;

/**
 *
 * @author ADM
 */
public class MaioresMdias {
    public static void main(String[] args) {
        int[][] mat={
            {6,9,50,30},
            {14,22,12,43},
            {8,3,2,6},
            {49,15,28,0},
        };
        
         
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
             System.out.println(" ");    
        }  
        int soma=0;
        int cont=0;
        // primeiro for para somar
        System.out.println(" ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                soma+=mat[i][j];
            }
        }
        
        // um for para contar quantos elementos 
        
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                cont++;
            }
        }  
            int media=soma/cont;
         System.out.println(" cont "+cont+" soma "+soma+" media "+media);
         
        
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
              if(mat[i][j]>media){
                  System.out.println(mat[i][j]+" e maior que a media "+ media);
              }
            }
        }  
         
    }
}
