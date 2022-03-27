package com.week4.Wednesday.Question3;


import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("abc.txt");
        int chr = fileReader.read();
        while (chr != -1){
            System.out.print( (char)chr);
            chr = fileReader.read();
        }
        fileReader.close();
    }
}
