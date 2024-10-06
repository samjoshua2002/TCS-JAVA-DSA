package greensjava.Test;

import java.util.HashSet;
import java.util.Scanner;

public class PalindromeArray {

    public static HashSet<Integer> findreverse(int digit) {
        HashSet<Integer> arr = new HashSet<>();
        int originalDigit = digit;
        int rem = 0;

        while (digit != 0) {
            int num = digit % 10;
            rem = rem * 10 + num;
            digit /= 10;
        }

        if (originalDigit == rem) {
            arr.add(originalDigit);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of numbers to find the palindrome: ");
        int limit = sc.nextInt();

        HashSet<Integer> palindromes = new HashSet<>();

        for (int i = 1; i <= limit; i++) {
            palindromes.addAll(findreverse(i));
        }

        System.out.println("Palindromes: " + palindromes);
    }
}
