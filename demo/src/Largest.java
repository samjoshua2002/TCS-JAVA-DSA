

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the three numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
            
        }
        if (a[0]> a[1] && a[0]> a[2]) {
            System.out.println(a[0]+" is the largest number");
            
        }
        else if (a[1]> a[0] && a[1]> a[2]) {
            System.out.println(a[1]+" is the largest number");
            
        }
        else System.out.println(a[2]+" is the largest number");
        sc.close();

    }
    
    
}
