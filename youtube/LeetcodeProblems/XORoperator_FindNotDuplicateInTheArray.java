package youtube.LeetcodeProblems;

import java.util.Scanner;
// [1 2 2 3 3 1 5]
// output 5 because it is the only non repeating element in the array
public class XORoperator_FindNotDuplicateInTheArray {
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
        int f=0;
        for (int i = 0; i < arr.length; i++) {
            f ^= arr[i];
            
        }
        System.out.println("The non repeating element in the array is "+f);
    }
    
}
