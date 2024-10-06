package greensjava.Test;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        
        int[] odd = new int[25];
        int[] even = new int[25];
        
        int oddIndex = 0; 
        int evenIndex = 0;
        int sumodd=0;
        int sumeven=0;
        int countodd=0;
        int counteven=0;
        
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
                sumeven+=i;
                counteven++;
            } else {
                odd[oddIndex++] = i;
                sumodd+=i;
                countodd++;
            }
        }
        
        System.out.println("Odd Numbers: " + Arrays.toString(odd));
        System.out.println();
        System.out.println("Even Numbers: " + Arrays.toString(even));
        System.out.println();
        System.out.println("The sum of 50 odd numbers is :" + sumodd);
        System.out.println();
        System.out.println("The sum of 50 even numbers is: "+sumeven);
        System.out.println();
        System.out.println("The total number of odd number "+ countodd);
        System.out.println();
        System.out.println("The total number of even number "+ counteven);
    }
}
