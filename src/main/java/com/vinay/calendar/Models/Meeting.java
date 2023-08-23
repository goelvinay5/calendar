package com.vinay.calendar.Models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;
@Getter
@Setter
public class Meeting extends Event{
    private String meetingLink;
    private List<ParticipantInfo> participantsInfo;
    private Time startTime;
    private Time endTime;
    private String location;
}
