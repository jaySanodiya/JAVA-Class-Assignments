package com.week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(21);
        arr.add(2);
        arr.add(45);
        arr.add(4);
        arr.add(9);
        arr.add(2);
        arr.add(8);
        arr.add(5);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.remove(1));
        System.out.println(arr.size());
        arr.add(1,12);
        System.out.println(arr);
        arr.set(1,69);
        System.out.println(arr);
        arr.add(1,96);
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.indexOf(2));
        System.out.println(arr.add(120));
        System.out.println(arr.contains(30));
        System.out.println(arr.isEmpty());
        System.out.println(arr.hashCode());

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        for(int i : arr){

                System.out.println(i);

        }

        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Integer il = 3886;
        System.out.println(il);

        int x = 3886;
        Integer il2 = Integer.valueOf(x);
        int y = il2.intValue();
        System.out.println(x==3886);

        Object[] na = arr.toArray();
        for(Object i: na){
            System.out.print( (Integer) i + 1 + " ");
        }
        System.out.println(arr.get(1));
        System.out.println(arr.get(1));
        TreeSet<Integer> jay = new TreeSet<>();
        jay.add(1);
        jay.add(2);
        System.out.println(jay);

    }
}
