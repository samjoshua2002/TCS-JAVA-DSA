package Udemy.LeetcodeProblems;

import java.util.Scanner;

// [10 3 5 2 6 ]  
// output 6 
 // Explanation of profit calculation:
                // Day 1 (Price = 10): No profit since the price drops to 3 on Day 2.
                // Day 2 (Price= 3): Buy at 3 and sell at 5 (Day 3) for a profit of 5 - 3 = 2.
                // Day 3 (Price = 5): No profit since the price drops to 2 on Day 4.
                // Day 4 (Price = 2): Buy at 2 and sell at 6 (Day 5) for a profit of 6 - 2 = 4.
                // Total Profit: 2 (from Day 2 to Day 3) + 4 (from Day 4 to Day 5) = 6.

public class BestTimeToSell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list");
        String result = scanner.nextLine();
        String[] array = result.split(" ");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        int profit=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] > arr[i]) {
                profit+=(arr[i+1] - arr[i]);

                
            }
            
        }
        System.out.println(profit);
        scanner.close();
    }
    
}
