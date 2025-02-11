package ShakeenGang;

import java.util.Scanner;

public class Adjacant {
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
        int sum=0;

        for (int i = 0; i < arr.length; i+=2) {
            sum += arr[i];

            
        }
        System.out.println(sum);
        
    }
    
}
