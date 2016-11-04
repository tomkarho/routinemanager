package com.protacon.toka.routinemanager.models;

import java.util.UUID;

/**
 * Created by toka on 4.11.2016.
 */

public class Routine {
    private UUID id;
    private String title;

    //region accessors

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

    public Routine(String title) {
        this.title = title;
        this.id = UUID.randomUUID();
    }

}
