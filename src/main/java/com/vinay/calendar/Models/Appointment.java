package com.vinay.calendar.Models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
@Getter
@Setter
public class Appointment extends Event{
    private Time startTime;
    private Time endTime;
    private String location;
}
