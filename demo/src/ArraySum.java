import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the array: ");
            int length= sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < arr.length; i++) {
                int a=sc.nextInt();
                arr[i]=a;
                sum+=a;
                
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(sum);
        }
        
    }
    
}
