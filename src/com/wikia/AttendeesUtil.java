package com.wikia;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by naveenkumarvasudevan on 12/5/15.
 */
public class AttendeesUtil {
    private LinkedList<Attendees> linkedList = new LinkedList<Attendees>();

    public LinkedList<Attendees> insertAttendees(Scanner input){
        getInput(input);
        return linkedList;
    }

    private void getInput(Scanner input){

        String name, date, time, till, lastInput;


        do {
            Attendees attendees = new Attendees();

            System.out.println("Please enter the name. Just simple one word name.");
            name = input.next();
            attendees.setName(name);

            System.out.println("Please enter the date and time from when you are free.");
            date = input.next();
            time = input.next();
            date = date+ " "+ time;
            Date date1 = createAndVaidateDate(date);
            attendees.setDateFrom(date1);


            System.out.println("Please enter date and time  till when you are free.");
            till = input.next();
            time = input.next();
            till = till + " "+time;
            Date date2 = createAndVaidateDate(till);
            attendees.setDateTill(date2);

            if(date1.compareTo(date2) > 0){
                System.out.println("The first date and time is after the second date and time. Exiting.");
                System.exit(0);
            }

            linkedList.add(attendees);

            System.out.println("Please enter 'q' to exit the program or enter 'c' to continue entering more attendees.");
            lastInput = input.next();

        }while (!lastInput.equalsIgnoreCase("q"));

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

    private Date getCurrentDate(){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy H:m");
        Date date = new Date();

        return date;
    }



    public static void showRandomMessageAfterName(){
        String message[] = {"Good. \n Now please enter a date when you are free. Note: Format should be MM/dd/yyyy H:m, where hours are in 24 hours format.",
        "Nice name. \n Now please enter a date when you are free. Note: Format should be MM/dd/yyyy H:m where hours are in 24 hours format."};

        int randInt = new Random().nextInt(message.length);

        System.out.println(message[randInt]);
     }
}
