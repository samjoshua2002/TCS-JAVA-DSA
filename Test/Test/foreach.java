package Test;

import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length= sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=sc.nextInt();
            
            
        }
        for (int i : arr) {
            System.out.print(i+ " ");
            
        }
    }
    
}
