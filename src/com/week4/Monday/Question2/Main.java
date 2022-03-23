package com.week4.Monday.Question2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String ,String > linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Madhya Pradesh","Bhopal");
        linkedHashMap.put("Maharashtra","Mumbai");
        linkedHashMap.put("Rajasthan","Jaipur");
        linkedHashMap.put("Odisha","Bhubaneswar");
        linkedHashMap.put("West Bengal","Kolkata");


        Set<Map.Entry<String ,String>> set = linkedHashMap.entrySet();
        for (Map.Entry<String ,String> pp:set) {
            System.out.println( "Capital of " + pp.getKey() + " is " + pp.getValue());
        }

    }
}
