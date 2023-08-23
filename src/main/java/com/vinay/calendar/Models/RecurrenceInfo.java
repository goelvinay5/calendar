package com.vinay.calendar.Models;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class RecurrenceInfo {
    private int id;
    private Date startDate;
    private Date endDate;
    private RecurrenceFrequency frequency;
    private List<Date> occurences;
}
