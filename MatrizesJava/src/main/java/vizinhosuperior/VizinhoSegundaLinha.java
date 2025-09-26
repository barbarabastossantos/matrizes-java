/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vizinhosuperior;

/**
 *
 * @author ADM
 */
public class VizinhoSegundaLinha {
    public static void main(String[] args) {
       // minha matriz
      int[][] mat={
          {12,27,37,85,36}, // indice -> 0 (linha 1)
          {87,94,78,61,31}, // indice -> 1 ( linha 2)
          {25,69,52,16,87}, // indice -> 2 ( linha 3)
      }; 
      // imprimindo minha matriz para meu usuario
      for(int i=0;i<mat.length;i++){ // primeiro for linha
          for(int j=0;j<mat[i].length;j ++){ // segundo for dentro do primeiro for percorre colunas 
              System.out.print(mat[i][j]+" ");
          }
          System.out.println(" ");
      }
      
      // resolucao do exercicio
      
      // como quero os vizinhos de cima da segunda linha pego o indice 1
      int ii=1;
     // for para percorrer as colunas da linha 1
      for(int j=0;j<mat[ii].length;j++){
          System.out.println("pos ("+ii+","+j+") -> vizinho superior = "+ mat[ii-1][j]);
      }
      
      
    }
}
