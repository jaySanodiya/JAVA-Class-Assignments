package com.week4.Wednesday.Question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromBuffer {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fileReader);

        String line = br.readLine();

        while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
