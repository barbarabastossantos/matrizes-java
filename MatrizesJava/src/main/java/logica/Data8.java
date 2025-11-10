/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.time.Instant;
/**
 *
 * @author ADM
 */
public class Data8 {
    public static void main(String[] args) {
      
        Instant d=Instant.parse("2025-11-10T16:30:15Z");
        Instant d2=Instant.parse("2025-11-10T16:30:15-03:00");
        
        System.out.println("Horario UTC -> "+d);
        System.out.println("Horario de Brasilia -> "+d2);
    }
}
