/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author ADM
 */
public class Data3 {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.parse("2025-11-19");
        LocalDateTime d2=LocalDateTime.parse("2025-11-19T19:48:22");
        Instant d3=Instant.parse("2025-11-19T19:48:22Z");
        
        //uma semana antes do d1 -> past(passado) week(semana) pastweekLocalDate e apenas o nome da variavel para fazermos o calculo 
        
    
        LocalDate pastWeekLocalDate=d1.minusDays(7);
        LocalDate nextWeekLocalDate=d1.plusDays(7);
        LocalDateTime pastWeekLocalDateTime=d2.minusDays(7);
        
        System.out.println("semana passada -> "+ pastWeekLocalDate);
        System.out.println("proxima semana -> "+ nextWeekLocalDate);
        
        
        Instant pastWeekInstant=d3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant=d3.plus(7, ChronoUnit.DAYS);
        
        System.out.println("pastWeekInstant -> "+pastWeekInstant);
        System.out.println("nextWeekInstant -> "+nextWeekInstant);
        
        Duration t1= Duration.between(pastWeekLocalDateTime, d2);
        
        System.out.println("duracao -> "+ t1.toDays());
        
        Period t2= Period.between(pastWeekLocalDate,d1);
        
        System.out.println(" Periodo -> "+t2.getDays());
        
        Duration t3=Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atStartOfDay()); // convertendo LocalDate para LocalDateTime
        
        System.out.println("t3 -> "+t3.toDays());
        
    }
}
