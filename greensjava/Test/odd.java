package greensjava.Test;

import java.util.Arrays;

public class odd {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int counter =0;
        int sum=0;

        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                arr[counter++]=i;
                sum+=i;

            }


        }

        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
