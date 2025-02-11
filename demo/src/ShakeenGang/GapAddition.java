package ShakeenGang;
import java.util.*;

public class GapAddition {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size:");
        int a = sc.nextInt();
        int[] array = new int[a];

        System.out.println("Enter array elements:");
        for(int i = 0; i < a; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter Gap:");
        int gap = sc.nextInt();

        if (a < gap) {
            System.out.println("Invalid gap");
        } else {
            System.out.println("Enter the output limit value:");
            int limit = sc.nextInt();

            if (limit <= 0) {
                System.out.println("Invalid limit");
            } else {
                int sum = 0;
                for (int i = 0; i < array.length; i += gap) {
                    sum += array[i];
                }
                System.out.println("Output sum: " + sum);
                
                for (int i = 1; i < limit; i++) {
                    System.out.println("Repeated Output sum (" + (i + 1) + "): " + sum);
                }
            }
        }

        sc.close();
    }
}
