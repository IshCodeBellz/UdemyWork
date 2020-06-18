package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleFileIO {


    public static void main(String[] args) throws Exception {

        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        out.println("this is a line in my file...");
        out.println("a second line in my file...");
        out.println("a third line in my file...");
        out.flush();
        out.close();

        Scanner sc = new Scanner(new BufferedReader(new FileReader("OutFile.txt")));
                // go through the file line by line
            while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);

        }
        System.out.println("file is finished");

    }
}
