package com.training.java8;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class DateFormatDemo {
    public static void main(String[] args) {
       
        
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusDays(7);
        LocalDate lastMonth = today.minusMonths(1);
        LocalDate nextYear = today.plusYears(1);

        System.out.println("Today: " + today);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Month: " + lastMonth);
        System.out.println("Next Year: " + nextYear);
        
        LocalTime now = LocalTime.now();
        LocalTime inAnHour = now.plusHours(1);
        LocalTime fiveMinutesAgo = now.minusMinutes(5);

        System.out.println("Now: " + now);
        System.out.println("In an Hour: " + inAnHour);
        System.out.println("Five Minutes Ago: " + fiveMinutesAgo);
        
        LocalTime start = LocalTime.of(10, 30);
        LocalTime end = LocalTime.of(12, 45);
        Duration duration = Duration.between(start, end);

        System.out.println("Duration in Hours: " + duration.toHours());
        System.out.println("Duration in Minutes: " + duration.toMinutes());
    }
}



