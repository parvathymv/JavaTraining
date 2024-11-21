package com.training.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;

public class PeriodDurationExample {
    public static void main(String[] args) {
        // Period example
        LocalDate startDate = LocalDate.of(2023, 11, 21);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.getYears() + " years, " 
                           + period.getMonths() + " months, " 
                           + period.getDays() + " days");

        // Duration example
        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.of(12, 45);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration.toHours() + " hours and " 
                           + duration.toMinutes() % 60 + " minutes");
    }
}

