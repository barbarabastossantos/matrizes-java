/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizinhosuperior;

/**
 *
 * @author ADM
 */
public class QuantosVizinhos {
    public static void main(String[] args) {
        int[][] mat={ //matriz 5x3
           //coluna
          // 0 1 2
            {1,2,3}, // linha 0
            {4,5,6}, // linha 1
            {7,8,9}, // linha 2
            {10,11,12}, // linha 3
            {13,14,15}, // linha 4
        };
        
         int cont=0;
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[i].length;j++){
                if(i-1>=0){
                    cont++;
                }
        }
    }
        
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[i].length;j++){
                System.out.print(mat[i][j]+ "  ");
        }
            System.out.println(" ");
    }
        System.out.println("\n A  matriz tem -> "+cont+ " vizinhos de cima ");
 }
}