package com.wikia;

import java.util.Date;

/**
 * Created by naveenkumarvasudevan on 12/5/15.
 */
public class Attendees {

    private String name;
    private Date dateFrom;
    private Date dateTill;
    private int totalTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        AttendeesUtil.showRandomMessageAfterName();

    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTill() {
        return dateTill;
    }

    public void setDateTill(Date dateTill) {
        this.dateTill = dateTill;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
