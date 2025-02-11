package greensjava.Test.Pdf;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PalindromeNumber {
    public static TreeSet<Integer> reverse(int digit){
        TreeSet<Integer> arr = new TreeSet<>();
        int ori=digit;
        int rem=0;
        while (digit!=0){
            int num =digit%10;
            rem =rem*10+num;
            digit/=10;
        }
        if (ori==rem){
            arr.add(ori);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit to find the palindrome: ");
        int digit= sc.nextInt();
        TreeSet<Integer> palindrome = new TreeSet<>();
        for (int i = 1; i <=digit ; i++) {
            palindrome.addAll(reverse(i));

        }
        System.out.println(palindrome);
    }
}
