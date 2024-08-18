package youtube.LeetcodeProblems;

import java.util.Scanner;

public class SortArrayNoOfTimes {
    public static void reverse(int[] num, int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of numbers separated by spaces:");
        String result = scanner.nextLine();
        String[] array = result.split(" ");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        System.out.println("Enter number of times the values need to be rotated:");
        int k = scanner.nextInt();

        
        k = k % arr.length;

        scanner.close();

        
        reverse(arr, 0, arr.length - 1);
        
        reverse(arr, 0, k - 1);
        
        reverse(arr, k, arr.length - 1);

        
        System.out.println("The rotated array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
