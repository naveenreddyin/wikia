package com.wikia;

import java.util.Date;

/**
 * Created by naveenkumarvasudevan on 12/5/15.
 */
public class Meeting {
    private int meetingLength;
    private int numberOfTimeSlots;
    private Date timeFrameFrom;
    private Date timeFrameTill;

    public int getMeetingLength() {
        return meetingLength;
    }

    public void setMeetingLength(int meetingLength) {
        this.meetingLength = meetingLength;
    }

    public int getNumberOfTimeSlots() {
        return numberOfTimeSlots;
    }

    public void setNumberOfTimeSlots(int numberOfTimeSlots) {
        this.numberOfTimeSlots = numberOfTimeSlots;
    }

    public Date getTimeFrameFrom() {
        return timeFrameFrom;
    }

    public void setTimeFrameFrom(Date timeFrameFrom) {
        this.timeFrameFrom = timeFrameFrom;
    }

    public Date getTimeFrameTill() {
        return timeFrameTill;
    }

    public void setTimeFrameTill(Date timeFrameTill) {
        this.timeFrameTill = timeFrameTill;
    }
}
