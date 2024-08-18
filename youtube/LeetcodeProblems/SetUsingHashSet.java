package youtube.LeetcodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class SetUsingHashSet {
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
        HashSet<Integer> number = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (number.contains(arr[i])) 
            {
                System.out.println("True");
                return;  // only return with finish the code and go outside of the loop
                
            }
            number.add(arr[i]);

            
        }
        System.out.println("false");
    }
}
