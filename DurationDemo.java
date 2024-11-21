package com.training.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationDemo {

	public static void main(String[] args) {
		LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
        LocalDateTime newDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 21, 56);

        System.out.println(oldDate);
        System.out.println(newDate);

        //count seconds between dates
        Duration duration = Duration.between(oldDate, newDate);

        System.out.println(duration.getSeconds() + " seconds");
        Instant now     = Instant.now();
     System.out.println(now.getNano());
        Instant later   = now.plusSeconds(3);
        Instant earlier = now.minusSeconds(3);
        System.out.println(later.getNano());

    }
}
