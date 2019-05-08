package com.etaTech;

import java.util.*;

/****************************************************
 *** Created by Fady Fouad on 04/05/2019 at 19:43.***
 ***************************************************/
public class Theater {
    private final String theaterName ;
    private List<Seat> seats=new LinkedList<>();
    static final Comparator<Seat>SEAT_COMPARATOR = Theater::compare;

    public Theater(String theaterName,int numRows,int seatsPerRow) {
        this.theaterName = theaterName;
        int lastRow = 'A'+(numRows-1);
        for (char row = 'A'; row <= lastRow ; row++) {
            for (int seatNum = 1; seatNum <=seatsPerRow; seatNum++) {
                double price =12.0;
                if (row<'D'&&seatNum>4&&seatNum<9){
                    price = 15;
                }else if (row>'F'||seatNum<4||seatNum>9){
                    price = 10 ;
                }
                Seat seat = new Seat(row + String.format("%02d",seatNum),price);
                seats.add(seat);
            }
        }
    }

    private static int compare(Seat seat1, Seat seat2) {
        if (seat1.getPrice() < seat2.getPrice()) {
            return 1;
        } else if (seat1.getPrice() > seat2.getPrice()) {
            return -1;
        }
        return 0;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = new Seat(seatNumber,0) ;

        int findSeat = Collections.binarySearch(seats,requestSeat,null);
        if (findSeat>=0){
            return seats.get(findSeat).reserve();
        }else {
            System.out.println("Seat Not Exist");
            return false;
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber ;
        private double price ;
        private boolean reserved = false ;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price =price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+ seatNumber+" Reserved");
                System.out.println("Please Pay"+" "+price);
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

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return seatNumber.compareTo(seat.getSeatNumber());
        }
    }

}