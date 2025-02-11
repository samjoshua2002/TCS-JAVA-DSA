package greensjava.Test;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int digit = sc.nextInt();


        int originalDigit = digit;
        int rem = 0;


        while (digit != 0) {
            int num = digit % 10;
            rem = rem * 10 + num;
            digit /= 10;
        }


        if (originalDigit == rem) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
