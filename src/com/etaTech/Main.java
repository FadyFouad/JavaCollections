package com.etaTech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Theater theater = new Theater("Fady",8,12);
        String theaterName = theater.getTheaterName();
        System.out.println(theaterName);
//        theater.getSeats();
        List<Theater.Seat>seats = new ArrayList<>(theater.getSeats());
        List<Theater.Seat>newSeats = new ArrayList<>(seats);
//        Collections.reverse(seats);
        Collections.shuffle(seats);
        sortList(seats);
        printList(newSeats);
        theater.reserveSeat("A01");
//        theater.reserveSeat("A01");
        seats.get(1).reserve();

    }
    public static void printList (List<Theater.Seat>seats){
        for (Theater.Seat seat:
             seats) {
            System.out.println(" "+seat.getSeatNumber());
        }
        System.out.println("-----------------------------------------------------------");
    }
    public static void sortList(List<? extends Theater.Seat> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}
