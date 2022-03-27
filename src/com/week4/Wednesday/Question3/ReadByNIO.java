package com.week4.Wednesday.Question3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadByNIO {
    public static void main(String[] args) throws IOException {
        Path p =Paths.get("abc.txt");

        List<String> s = Files.readAllLines(p);

        for (String srt :s) {
            System.out.println(srt);
        }

    }
}
