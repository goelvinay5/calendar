package com.vinay.calendar.Models;
import java.util.Date;
import java.util.List;

public class RecurrenceInfo {
    private int id;
    private Date startDate;
    private Date endDate;
    private RecurrenceFrequency frequency;
    private List<Date> occurences;
}
