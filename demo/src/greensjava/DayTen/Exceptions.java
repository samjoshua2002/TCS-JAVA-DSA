package greensjava.DayTen;


import java.util.Arrays;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        
        try {
            int n = 9;
            System.out.println(n / 0);
        } catch (Exception e) {
            System.out.println("Cannot divide a number by 0");
        }

       
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("String is null");
        }

        
        try {
            int[] arr = new int[10];
            arr[11] = 34;
            System.out.println(Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("Array index out of bounds");
        }

        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Your age is: " + age);
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        }

       

        
    }
}
