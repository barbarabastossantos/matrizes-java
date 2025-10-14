/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Produto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        String[] produto=new String[5];
        double[] preco=new double[5];
        
        for(int i=0;i<5;i++){
            System.out.println("Digite o nome do produto numero -> "+(i+1));
            produto[i]=sc.nextLine();
            System.out.println("Digite o preco "+produto[i]);
            preco[i]=sc.nextDouble();
            sc.nextLine();
            
        }
        System.out.println("Produtos qur custam menos de R$ 50,00\n");
        for(int i=0;i<5;i++){
            if(preco[i]<50){
                System.out.println(produto[i]+ " no valor de R$ "+preco[i]);
            }
        }
        sc.close();
    }
 
}
