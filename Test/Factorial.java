package Test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number to find the factorial : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c=a;
        int ans =1;
        while (a!=0) {
            ans*=a;
            a--;

            
        }
        System.out.println("The factorial of "+c+" is "+ans);
        sc.close();
        

    }
    
}
