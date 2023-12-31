package com.vinay.calendar.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.TimeZone;
@Getter
@Setter
public class Calendar {
    private int id;
    private String name;
    private String description;
    private TimeZone timeZone;
    private List<Event> events;

}
