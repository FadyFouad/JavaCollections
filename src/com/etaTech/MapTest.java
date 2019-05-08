package com.etaTech;

import java.util.HashMap;
import java.util.Map;

/****************************************************
 *** Created by Fady Fouad on 08/05/2019 at 15:03.***
 ***************************************************/
public class MapTest {
    public static void main(String[] args) {

        Map<String,String> langs = new HashMap<>();
        langs.put("Java"," Great Language");
        langs.put("Kotlin"," Based on Java");
        langs.put("Go"," Functional programing lang");
        langs.put("Pyathon"," Simple lang");

        System.out.println(langs.get("Go"));
        langs.put("Go"," Duplpicated value");
        System.out.println(langs.get("Go"));

        if (langs.containsKey("Go")){
            System.out.println("Go is already exists");
        }else {
            langs.put("Go","Duplpicated value.");
            System.out.println(langs.get("Go"));
            System.out.println("Go Added :)");
        }
        System.out.println("-----------------------------Map Content ----------------------");
        for (String s:
             langs.keySet()) {
            System.out.println(s);
            System.out.println(langs.get(s));
        }
    }
}