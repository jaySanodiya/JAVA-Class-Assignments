package com.week3;

import java.util.Stack;

public class list {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.push("A");
        System.out.println(list.push("B"));
        list.push("C");
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list);

    }
}
