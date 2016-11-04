package com.protacon.toka.routinemanager.models;

import java.util.Date;
import java.util.UUID;

/**
 * Created by toka on 4.11.2016.
 */

public class Routine {
    private UUID id;
    private String title;

    private Date endTime;
    private Date startTime;

    //region accessors
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //endregion

    public Routine() {
        this.id = UUID.randomUUID();
        this.startTime = new Date();
        this.endTime = new Date(this.startTime.getTime() + 60 * 60 * 1000);
    }

    public Routine(String title, Date startTime, Date endTime) {
        this.title = title;
        this.id = UUID.randomUUID();
        this.startTime = startTime;
        this.endTime = endTime;
    }

}
