package com.wikia;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by naveenkumarvasudevan on 12/6/15.
 */
public class MeetingUtil {
    private Meeting meeting;

    public void askMeetingInformation(Scanner input){
        Meeting meeting = new Meeting();

        System.out.println("Please enter meeting length. Note: as integer please.");
        meeting.setMeetingLength(Integer.parseInt(input.next()));

        System.out.println("Please enter number of time slots you want the program to find, as integer please.");
        meeting.setNumberOfTimeSlots(input.nextInt());

        System.out.println("Please enter start date and time for time frame. " +
                "Format should be dd/MM/yyyy H:m, where H:m is in 24 hours notation.");
        meeting.setTimeFrameFrom(createAndVaidateDate(input.next() + " " + input.next()));

        System.out.println("Please enter end date and time for time frame. " +
                "Format should be dd/MM/yyyy H:m, where H:m is in 24 hours notation.");
        meeting.setTimeFrameTill(createAndVaidateDate(input.next()+" "+input.next()));

        this.meeting = meeting;

    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    private Date createAndVaidateDate(String dateString){

            DateFormat format = new SimpleDateFormat("dd/MM/yyyy H:m");
            Date date = null;
            try{
                date = format.parse(dateString);

            }catch (Exception e){
                System.out.println("Please enter date and time in proper format. Exiting the program. ");
                System.exit(0);
            }

            return date;
    }
}
