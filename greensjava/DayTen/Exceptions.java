package greensjava.DayTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        //unchecked exception run time exception
//        int n=9;
//        System.out.println(n/0);
//        String s=null;
//        System.out.println(s.length());
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your age: ");
//        int age = sc.nextInt();
//        int[] arr = new int[10];
//        arr[11]=34;
//        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,6,7));
        System.out.println(list);
   }
}
