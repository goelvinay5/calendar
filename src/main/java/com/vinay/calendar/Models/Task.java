package com.vinay.calendar.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Task extends Event{
    private Date time;
}
