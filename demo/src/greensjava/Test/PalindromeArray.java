package greensjava.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PalindromeArray {

    public static TreeSet<Integer> findreverse(int digit) {
        TreeSet<Integer> arr = new TreeSet<>();
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

        TreeSet<Integer> palindromes = new TreeSet<>();

        for (int i = 1; i <= limit; i++) {
            palindromes.addAll(findreverse(i));
        }

        System.out.println("Palindromes: " + palindromes);
    }
}
