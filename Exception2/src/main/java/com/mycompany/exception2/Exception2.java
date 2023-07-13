package com.mycompany.exception2;

public class Exception2 {
    public static void main(String[] args) {
        int i;
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int value = numbers[2];
            System.out.println("value is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        } finally {
            for (i = 0; i < numbers.length; i++) {
                System.out.println("" + numbers[i]);
            }
        }
    }
}
