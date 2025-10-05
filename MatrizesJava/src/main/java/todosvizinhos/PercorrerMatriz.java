/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todosvizinhos;

/**
 *
 * @author ADM
 */
public class PercorrerMatriz {
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        for(int i=0;i<mat.length;i++){
            for( int j=0;j<mat[i].length;j++){
                System.out.println("Na posicao ["+i+"]["+j+"] esta o numero -> "+ mat[i][j]);
            }
        }
    }
}
