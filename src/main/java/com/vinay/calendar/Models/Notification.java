package com.vinay.calendar.Models;

import java.util.Date;

public class Notification {
    private int id;
    private Date triggerTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }
}
