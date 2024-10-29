package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Frequency
 */
public class Frequency {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length= sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=sc.nextInt();
            
            
        }
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            if (!map.containsKey(i)) map.put(i,0);
            map.put(i, map.get(i) + 1);
            
        }
        System.out.println(map);

        System.out.println("Element occurs more than twice");
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()>2) {
                System.out.println(entry.getKey());
                
            }

            
            
        }

        
    }
}