package com.vinay.calendar.Models;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private  int id;
    private String name;
    private String email;
    private List<Calendar> calendar;

    public void printUser(){
        System.out.println("user...");
    }
}
