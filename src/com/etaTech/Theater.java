package com.etaTech;

import java.util.ArrayList;
import java.util.List;

/****************************************************
 *** Created by Fady Fouad on 04/05/2019 at 19:43.***
 ***************************************************/
public class Theater {
    private final String theaterName ;
    private List<Seat> seats=new ArrayList<>();

    public Theater(String theaterName,int numRows,int seatsPerRow) {
        this.theaterName = theaterName;
        int lastRow = 'A'+(numRows-1);
        for (char row = 'A'; row <= lastRow ; row++) {
            for (int seatNum = 1; seatNum <=seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }
    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = null ;
        for (Seat seat:
             seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestSeat = seat;
                break;
            }
        }
        if (requestSeat==null){
            System.out.println("no seat. ");
            return false;
        }else {
            return requestSeat.reserve();
        }

    }

    public String getTheaterName() {
        return theaterName;
    }
    public void getSeats(){
        for (Seat seat:
             seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private final String seatNumber ;
        private boolean reserved = false ;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+ seatNumber+" Reserved");
                System.out.println("Please Pay");
                return true;
            }else {
                System.out.println("Sorry Seat "+seatNumber+" is reserved");
                return false;
            }
        }
        public boolean cancle(){
            if (this.reserved){
                this.reserved = false ;
                System.out.println("reversation cancled");
                return true;
            }
            return false ;
        }
    }
}