package com.week4.Monday.Question1;

import java.util.*;

public class SortingHashmap{

    public Map<String,Student> sortByValue(Map<String ,Student> map){
        Set<Map.Entry<String,Student>> set = map.entrySet();
        List<Map.Entry<String,Student>> list = new ArrayList<>(set);
        list.sort(new sortByMarks());

        Map<String,Student> linked = new LinkedHashMap<>();
        for (Map.Entry<String ,Student> sorted : list) {
            linked.put(sorted.getKey(),sorted.getValue());
        }

        return linked;
    }

    public static void main(String[] args) {
        Map<String , Student> map = new HashMap<>();
        map.put("Maharashtra",new Student(12,"jay",500));
        map.put("Madhyapradesh",new Student(13,"vijay",400));
        map.put("Chattishgarh",new Student(16,"jayShree",5000));
        map.put("Rajeshthan",new Student(14,"ajay",550));
        map.put("Odisa",new Student(15,"jaya",870));

       /* Set<Map.Entry<String, Student>> mapEntry = map.entrySet();

        List<Map.Entry<String, Student>> list = new ArrayList<>(mapEntry);

        list.sort(new sortByMarks());
        for (Map.Entry<String,Student> s:list) {
            System.out.println(s);
        }*/

        SortingHashmap sHm = new SortingHashmap();

        LinkedHashMap<String,Student> completeSorting = (LinkedHashMap<String, Student>) sHm.sortByValue(map);

        Set<Map.Entry<String ,Student>> setValue = completeSorting.entrySet();

        for (Map.Entry<String ,Student> printValue:setValue) {
            System.out.println(printValue.getKey() + "---------------------" + printValue.getValue());
        }

    }

}