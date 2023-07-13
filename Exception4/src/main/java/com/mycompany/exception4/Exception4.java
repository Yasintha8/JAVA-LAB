package com.mycompany.exception4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);

            // Read file contents or perform any operations here

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}