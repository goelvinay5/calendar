package com.vinay.calendar.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Notification {
    private int id;
    private Date triggerTime;
}
