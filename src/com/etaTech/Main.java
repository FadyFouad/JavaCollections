package com.etaTech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Fady",8,12);
        String theaterName = theater.getTheaterName();
        System.out.println(theaterName);
        List<Theater.Seat>seats = new ArrayList<>(theater.getSeats());
        List<Theater.Seat>newSeats = new ArrayList<>(seats);
        Collections.shuffle(seats);
        sortList(seats);
//        printList(newSeats);
        theater.reserveSeat("A01");
        seats.get(1).reserve();

        List<Theater.Seat>seatList = new ArrayList<>(theater.getSeats());
        seatList.add(theater.new Seat("B++",10));
        seatList.add(theater.new Seat("C++",11));
        Collections.sort(seatList,Theater.SEAT_COMPARATOR);
        printList(seatList);

    }
    public static void printList (List<Theater.Seat>seats){
        for (Theater.Seat seat:
             seats) {
            System.out.println(" "+seat.getSeatNumber()+" -> "+seat.getPrice()+"$");
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
