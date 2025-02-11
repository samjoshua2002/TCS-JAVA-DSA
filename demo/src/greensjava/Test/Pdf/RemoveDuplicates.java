package greensjava.Test.Pdf;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]= Integer.parseInt(arr[i]);

        }
        for (int i : arr2){
            set.add(i);
        }
        System.out.println(set);
    }
}
