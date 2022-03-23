
package com.week3;

/*


import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String args[]) {
        LocalDate cDate = LocalDate.now();

        LocalDate dob = LocalDate.of(1998,4,9);

        Period diff = Period.between(dob,cDate);
        System.out.println(diff);
        System.out.println(diff.getDays());

    }
}
*/

/*
import java.util.Scanner;

public class Main{
    static int NzScore;
    static int NzSuperOver;
    static int NzFours;
    static int EngScore;
    static int EngSuperOver;
    static int EngFours;

    void IP(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] LineBreaker = input.split("\n");
        String[] Nz = LineBreaker[0].split(" ");
        String[] Eng = LineBreaker[1].split(" ");

        this.NzScore = Integer.parseInt(Nz[0]);
        this.NzSuperOver = Integer.parseInt(Nz[1]);
        this.NzFours = Integer.parseInt(Nz[2]);

        this.EngScore = Integer.parseInt(Eng[0]);
        this.EngSuperOver = Integer.parseInt(Eng[1]);
        this.EngFours = Integer.parseInt(Eng[2]);
    }
    public static void main(String[] args){


    }
}*/
/*

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        ArrayList<Student> students= new  ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(true){
            System.out.println("Enter Details of Student number "+ ++count);

            System.out.println("Enter Roll number");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter name");
            String name = sc.nextLine();


            System.out.println("Enter marks");
            int mark = sc.nextInt();

            Student std = new Student(roll,name,mark);

            students.add(std);

            System.out.println("Want More (y/n) ?");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("n"))
                break;

        }

        System.out.println("Printing Details of all Students");
        System.out.println("=================================");

        for (Student student:students) {
            System.out.println("Roll number is "+ student.getRoll());
            System.out.println("Name is "+student.getName());
            System.out.println("Mark is "+ student.getMark());

            System.out.println("----------------------------------");
        }

    }
}

*/


/*
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  Line1 = sc.nextLine();
        String[] arr1 = Line1.split(" ");

        String Line2 = sc.nextLine();
        String[] arr = Line2.split(" ");

        ArrayList<Integer> searchHere = new ArrayList<>();

        for (String i:arr){
            searchHere.add(Integer.parseInt(i));
        }

        int N = Integer.parseInt(arr1[0]);
        int Q = Integer.parseInt(arr1[1]);
        for (int i = 0; i <Q ; i++) {
            if(searchHere.contains(sc.nextInt())){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}*/


//Party or not
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String Line2 = sc.nextLine();
        String[] StrArr1 = Line2.split(" ");
        int[] arr1 = new int[StrArr1.length];


        String Line3 = sc.nextLine();
        String[] StrArr2 = Line3.split(" ");
        int[] arr2 = new int[StrArr2.length];

        for(int i=0;i<StrArr1.length;i++){
            arr1[i] = Integer.parseInt(StrArr1[i]);
            arr2[i] = Integer.parseInt(StrArr2[i]);
        }

        int count = 1;
        boolean flag = true;
        for(int i=1;i<StrArr1.length;i++){
            count++;
            if(arr1[i]<arr2[i-1]){
                if(count>k){
                    System.out.println("Not Possible");
                    flag = false;
                    break;
                }
            }
            else{
                count--;
            }
        }
        if(flag)
            System.out.println("Possible");

    }
}*/

//Discover number

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BinaryOperator;

public class Main {
    public static void DiscoverNumber(ArrayList<Integer> arr, int Q){
*/

        /*if(arr.contains(Q)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");*/

/*
        int L = 0;
        int R = arr.size()-1;
        while(L<=R){
            int mid = (L+R)/2;
            mid = mid - mid%1;
            if(arr.get(mid) > Q){
                R = mid-1;
            }
            else if(arr.get(mid) <Q){
                L = mid+1;
            }
            else{
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));

//        Reading N and Q
        String[] Line1 = bc.readLine().split(" ");
        int N = Integer.parseInt(Line1[0]);
        int Q = Integer.parseInt(Line1[1]);

//        Reading array
        String[] Line2 = bc.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<Line2.length;i++){
            arr.add(Integer.parseInt(Line2[i]));
        }

        Collections.sort(arr);

//        Iterating for queries
        for (int i = 0; i < Q; i++) {
            int query = bc.read();
            DiscoverNumber(arr,query);
        }


    }
}*/


import java.util.Arrays;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,324,0,234,43};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        TreeSet<Integer> nums = new TreeSet<>();
    }
}