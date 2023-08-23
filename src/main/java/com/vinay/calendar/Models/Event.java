package com.vinay.calendar.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public abstract class Event {
    private int id;
    private String name;
    private String Description;
    private List<Notification> notifications;
    private RecurrenceInfo recurrence;
}
