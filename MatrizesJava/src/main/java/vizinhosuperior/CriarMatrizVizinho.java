/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizinhosuperior;

/**
 *
 * @author ADM
 */
public class CriarMatrizVizinho {
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        
        int[][] mat2=new int[4][4]; // aqui a matriz que vai ser criada a partir da primeira matriz
        
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[i].length;j++){
                if(i-1>=0){
                    mat2[i][j]=mat[i-1][j]; // se tiver viznho de cima a nova matriz vai receber os elementos de cima da mat
                }else{ // se nao  a mat2 vai receber 0
                    mat2[i][j]=0;
                }
            }
        }
        
        System.out.println(" \n matriz \n  ");
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[i].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("\n matriz nova dos vizinhos superiores");
            System.out.println(" \n matriz \n  ");
        for(int i=0;i< mat2.length;i++){
            for(int j=0;j< mat2[i].length;j++){
                System.out.print(mat2[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}

