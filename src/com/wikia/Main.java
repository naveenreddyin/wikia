package com.wikia;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AttendeesUtil attendeesUtil = new AttendeesUtil();
        LinkedList<Attendees> attendeesLinkedList = attendeesUtil.insertAttendees(input);

        MeetingUtil meetingUtil = new MeetingUtil();
        meetingUtil.askMeetingInformation(input);
        Meeting meeting = meetingUtil.getMeeting();

        Compute compute = new Compute();
        compute.computeAndShowTimeSlots(attendeesLinkedList, meeting);
    }


}
