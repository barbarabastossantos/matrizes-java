/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Soma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //inicializando as variaveis para o loop
        int soma=0;
        int maior=0;
        int menor=0;
        
        // laco de repeticao 
        for(int i =0; i< 8;i++){
            System.out.print("Digite o "+(i+1)+" numero -> ");
            int x = sc.nextInt();
            soma+=x; // nossa variavel soma vai receber a cada vez que entrar no loop a adicao dos numeros digitados
            
            if(i==0){ // essa condicao e super necessaria para nosso codigo rodar sem erros , se for a primeira vez entrando no loop:
                // as variaveis vao receber  o x digitado , nao pode deixar com o valor inicializado 0 vai que o numero digitado e negativo
                maior=x;
                menor=x;
            }else{  // aqui ja e nossa logica em si do maior e menor 
                if(x>maior){
                    maior=x;
                }else if(x< menor){
                    menor=x;
                    
                }
            }
            
        }
        
        
        System.out.println("A soma dos numeros digitados foi -> "+ soma +"\nO maior numero digitado foi -> "+maior+"\nO menor numero digitado foi -> "+menor);
        sc.close();
    }
}
