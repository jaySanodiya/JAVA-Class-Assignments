package com.week4.Tuesday.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@FunctionalInterface
interface inter{
    List<String> sortName(List<String> name);
}

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Seoni");
        list.add("Jabalpur");
        list.add("Nagpur");
        list.add("Bhopal");
        list.add("Indore");

        inter i1 = (n) -> {
            TreeSet<String> sorted = new TreeSet<>(n);
            List<String> answer = new ArrayList<>(sorted);

          return answer;
        };

        System.out.println(i1.sortName(list));
    }
}
