package com.vinay.calendar.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipantInfo {
    private int id;
    private User user;
    private ParticipantType type;
}
