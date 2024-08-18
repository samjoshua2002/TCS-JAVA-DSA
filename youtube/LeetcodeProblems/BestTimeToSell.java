package youtube.LeetcodeProblems;

import java.util.Scanner;

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
