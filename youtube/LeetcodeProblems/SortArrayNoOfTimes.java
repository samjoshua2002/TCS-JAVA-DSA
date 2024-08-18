package youtube.LeetcodeProblems;

import java.util.Scanner;

public class SortArrayNoOfTimes {
    public static void reverse( int[] num , int start ,int end){
        while (start<end) {
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;

            
        }
        for (int i : num) {
            System.out.print(i+ " ");
            
        }
        
    }
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
        reverse( arr ,0 , arr.length-1);
    }
    
}
