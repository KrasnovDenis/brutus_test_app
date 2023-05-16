package com.krasnov.counter;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableScheduling
public class Counter {


    private static int counter = 0;

    @Scheduled(fixedDelayString = "${counter.delay_log_push}")
    public static void count() {
        Date date = new Date(System.currentTimeMillis());
        String timestamp = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").format(date);
        System.out.printf("%d: Timestamp %s%n", counter++, timestamp);
    }
}
