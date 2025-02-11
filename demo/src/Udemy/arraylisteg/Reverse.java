package Udemy.arraylisteg;

import java.util.Scanner;

public class Reverse {

    static String reverse(String s){
        String x = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            x += s.charAt(i);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String s = sc.nextLine();
        sc.close();
        
        
        
        System.out.println("Reversed string: " + reverse(s));
    }
}
