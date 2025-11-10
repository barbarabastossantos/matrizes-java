/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 *
 * @author ADM
 */
public class Data9 {
    public static void main(String[] args) {
        
    
    DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
   
    LocalDate d=LocalDate.parse("10/11/2025",fmt1);
    LocalDateTime d2= LocalDateTime.parse("10/11/2025 07:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(d);
        System.out.println(d2);
    
    }
}
