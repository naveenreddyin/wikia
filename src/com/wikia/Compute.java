package com.wikia;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by naveenkumarvasudevan on 12/5/15.
 */
public class Compute {


    public void computeAndShowTimeSlots(LinkedList<Attendees> attendeesLinkedList, Meeting meeting){
        HashMap<String, Integer> finalResultMap = new HashMap<String, Integer>();
        LinkedList<Attendees> attendeesLinkedListResult = new LinkedList<Attendees>();

        for(Attendees attendees: attendeesLinkedList){

            finalResultMap.put(attendees.getName(), -1);

            if(meeting.getTimeFrameFrom().compareTo(attendees.getDateFrom()) * attendees.getDateFrom().compareTo(meeting.getTimeFrameTill()) > 0){

                if(attendees.getDateTill().compareTo(meeting.getTimeFrameTill()) < 0){
                    finalResultMap.put(attendees.getName(), 1);
                    attendeesLinkedListResult.add(attendees);
                }

            }

        }

        System.out.println("Total number of attendees: "+attendeesLinkedList.size());
        if(attendeesLinkedListResult.size() != attendeesLinkedList.size()){
            System.out.println("Sorry, but no common time slot could be found. ");
            System.out.println("All the people who could attend are: ");
            for (Map.Entry<String, Integer> entry : finalResultMap.entrySet())
            {
                if(entry.getValue() != -1)
                    System.out.println("Name: "+entry.getKey());
            }
            System.out.println("And, the people who could not attend are: ");
            for (Map.Entry<String, Integer> entry : finalResultMap.entrySet())
            {
                if(entry.getValue() != 1)
                    System.out.println("Name: "+entry.getKey());
            }

        }else{

            System.out.println("Yes, all the attendees will be able to attend in the time slot.");
            System.out.println("The people who will be attending are: ");
            for(Attendees attendees: attendeesLinkedListResult){
                System.out.println(" Name: "+attendees.getName()+ " Time: "+attendees.getDateFrom());
            }
        }

    }

}
