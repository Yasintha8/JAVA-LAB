package com.mycompany.code;
public class Code 
{

     public static void main(String[] args) {
        char grade = 'A';
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            default:
                System.out.println("Invalid grade.");
                break;
        }
    }
}