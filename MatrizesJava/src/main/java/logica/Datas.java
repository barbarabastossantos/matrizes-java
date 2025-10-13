/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author ADM
 */
public class Datas {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.now();
        LocalDateTime d2=LocalDateTime.now();
        Instant d3=Instant.now();
        
        LocalDate d4=LocalDate.parse("2025-10-12");
        LocalDateTime d5=LocalDateTime.parse("2025-10-12T01:30:26");
        System.out.println("hora em texto -> "+ d5);
        System.out.println("hora em texto -> "+ d4);
        System.out.println("Fuso de londres -> "+d3);
        System.out.println("Data de hoje -> " + d1);
        System.out.println("Ano - mes - dia / hora - minuto - segundo - fracao de segundo -> "+d2);
    }
}
