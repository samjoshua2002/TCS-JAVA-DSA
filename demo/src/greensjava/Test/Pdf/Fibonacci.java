package greensjava.Test.Pdf;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       int[] arr = new int[100];
       arr[0]= 0;
       arr[1]=1;
        for (int i = 2; i <100 ; i++) {
            arr[i]=arr[i-1]+arr[i-2];


        }
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the fibonacci series: ");
        int a = sc.nextInt();
        a+=1;
        System.out.println(arr[a]);


        }

    }

