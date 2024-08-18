package Udemy.LeetcodeProblems;

import java.util.Scanner;
// input [1 1 2 2 2 3 3 3 3 3 4 4]
//output [1 2 3 4]=> no of elements four so the answer is  4

public class SortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list");
        String result = scanner.nextLine();
        String[] array = result.split(" ");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        int u =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[u] != arr[i]) {
                arr[u+1]=arr[i];
                u++;
                
            }
            
        }
        System.out.println(u+1);
        // for (int i : arr) {
        //     System.out.print(i+ " ");
            
        // }
        scanner.close();
    }
    
}
