package com.etaTech.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/****************************************************
 *** Created by Fady Fouad on 5/9/2019 at 4:44 PM.***
 ***************************************************/
public class Main {
    private static Map<Integer,Location>locationMap = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("\n============================= Adventure =========================\n");
        Scanner scanner = new Scanner(System.in);

        locationMap.put(0,new Location(0,"Out Of Game"));
        locationMap.put(1,new Location(1,"room 1"));
        locationMap.put(2,new Location(2,"room 2"));
        locationMap.put(3,new Location(3,"room 3"));
        locationMap.put(4,new Location(4,"room 4"));
        locationMap.put(5,new Location(5,"room 4+"));
        locationMap.put(5,new Location(5,"room 5"));

        locationMap.get(1).addExit("W",2);
        locationMap.get(1).addExit("E",3);
        locationMap.get(1).addExit("S",4);
        locationMap.get(1).addExit("N",5);
        locationMap.get(1).addExit("Q",0);

        locationMap.get(2).addExit("N",5);
        locationMap.get(2).addExit("Q",0);

        locationMap.get(3).addExit("W",1);
        locationMap.get(3).addExit("Q",0);

        locationMap.get(4).addExit("N",1);
        locationMap.get(4).addExit("W",2);
        locationMap.get(4).addExit("Q",0);

        locationMap.get(4).addExit("S",1);
        locationMap.get(4).addExit("W",2);
        locationMap.get(4).addExit("Q",0);



        int location = 1 ;
        while (true){
            System.out.println(locationMap.get(location).getDesc());
            if (location == 0 ){
                break;
            }
            Map<String ,Integer> exits = new HashMap(locationMap.get(location).getExits());

            for (String exit :
                    exits.keySet()) {
                System.out.println(exit+" -> " + " "+ locationMap.get(exits.get(exit)).getDesc());
            }
                location = scanner.nextInt();
                if (!locationMap.containsKey(location)) {
                    System.out.println("Location Not Available");
                    break ;
            }

        }


        for (int i : locationMap.keySet()) {
//            System.out.println(locationMap.get(i).getDesc());
        }
    }
}