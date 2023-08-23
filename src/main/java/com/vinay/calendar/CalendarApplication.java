package com.vinay.calendar;

import com.vinay.calendar.Models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalendarApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CalendarApplication.class, args);
        System.out.println("welcome to boot...");

    }

}
