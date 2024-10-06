package greensjava.Test;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a % 2 == 0) ? "It's even" : "It's odd");
    }
}
