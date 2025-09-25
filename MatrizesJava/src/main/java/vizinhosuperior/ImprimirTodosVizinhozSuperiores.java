/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizinhosuperior;

/**
 *
 * @author ADM
 */
public class ImprimirTodosVizinhozSuperiores {
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3,4},
            {0,9,7,6},
            {8,4,2,8},
            {6,1,9,3},
        };
        
        
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[i].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" \n Todos os vizinhos de cima \n ");
        
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[i].length;j++){
                if(i-1>=0){
                    System.out.println(" Na posicao ["+i+"]["+j+"] temos o numero -> "+ mat[i][j]+ " que seu vizinho  de cima e -> " +mat[i-1][j]+" na posicao ["+(i-1)+"]["+j+"]");
                } else{
                    System.out.println(" Na posicao    ["+i+"]["+j+"] temos o numero -> "+mat[i][j]+" nao tem vizinho!");
                }
            }
        }
     
        
    }
}
