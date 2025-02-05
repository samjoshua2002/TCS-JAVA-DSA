

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter the String to find the palindrome: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println((reverse.equals(str)?"Its palindrome":"Its not a palindrome"));
        sc.close();
    }
    
}
