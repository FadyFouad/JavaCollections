package com.etaTech.Adventure;


import java.util.HashMap;
import java.util.Map;

/****************************************************
 *** Created by Fady Fouad on 5/9/2019 at 4:45 PM.***
 ***************************************************/

public class Location {
    private final int locationID;
    private final String desc;
    private final Map<String,Integer> exits;

    public int getLocationID() {
        return locationID;
    }

    public String getDesc() {
        return desc;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);//cant change outside this class
    }

    public Location(int locationID, String desc) {
        this.locationID = locationID;
        this.desc = desc;
        this.exits = new HashMap<>();
    }

    public void addExit(String exitDescrption , int location){
        exits.put(exitDescrption,location);
    }

}