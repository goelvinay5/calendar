package com.vinay.calendar.Factories;

import com.vinay.calendar.Models.*;

public class EventFactory extends Event {
    public static Event getEvent(EventType type) {
        if (type == null) {
            return null;
        }
        if (type == EventType.MEETING) {
            return new Meeting();
        } else if (type == EventType.APPOINTMENT) {
            return new Appointment();
        } else if (type == EventType.TASK) {
            return new Task();
        }
        return null;
    }
}
