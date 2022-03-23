package com.week4.Monday.Question1;

import java.util.Comparator;
import java.util.Map;

public class sortByMarks implements Comparator<Map.Entry<String, Student>> {

    @Override
    public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
        return o1.getValue().getMark() > o2.getValue().getMark() ? +1:-1;
    }
}
