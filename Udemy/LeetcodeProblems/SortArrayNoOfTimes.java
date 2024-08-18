package Udemy.LeetcodeProblems;

import java.util.Scanner;
//input [1 2 3 4 5 6 7 ] k =3  three times need to right shift
//steps followed reverse the string 
//reverse with help of k the term [7 6 5 4 3 2 1] k=3  so  => [5 6 7 4 3 2 1] =>[5 6 7 1 2 3 4 ]
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
