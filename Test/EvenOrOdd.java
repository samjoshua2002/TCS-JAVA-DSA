package Test;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check wheather its even or odd: ");
        int a= sc.nextInt();
        System.out.println((a%2==0)?"ITS EVEN": "ITS ODD");
        sc.close();
    }
    
}
