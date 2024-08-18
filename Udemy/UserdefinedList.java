package Udemy;

import java.util.Scanner;

public class UserdefinedList {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list");
        String result = scanner.nextLine();
        String[] array = result.split(" ");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        scanner.close();
        
        for (int i : arr) {
            System.out.println(i);
            
        }


       
    }
    
}
