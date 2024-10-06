package greensjava.Test.Pdf;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to sort: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

            
        }
        for (int a : arr){
            System.out.println(a+" ");

        }
        System.out.println("the second minimum element in the array is" + arr[1]);
    }
}
