package Test;

import java.util.Arrays;


public class Fibonnaci {
    public static void main(String[] args) {
        int[] arr = new int[10];
       arr[0]= 0;
       arr[1]=1;
        for (int i = 2; i <arr.length ; i++) {
            arr[i]=arr[i-1]+arr[i-2];


        }
        System.out.println(Arrays.toString(arr));
    }
    
}
