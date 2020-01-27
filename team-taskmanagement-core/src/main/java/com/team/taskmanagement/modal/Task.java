package com.team.taskmanagement.modal;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class Task {

    private Date taskDate;
    private Time startTime;
    private Time endTime;
    private String customerName;
    private String taskDescription;
    private String user;
    private Time timeSpent;
    private double hoursSpent;

}
