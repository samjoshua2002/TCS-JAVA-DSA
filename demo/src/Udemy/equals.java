package Udemy;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press q or Q to quit");

        String value=sc.nextLine();
        if (value.equals("q")||value.equals("Q")) {

            System.out.println("QUIT THE PROGRAM");

        }
        else {
            System.out.println("continue the game");
        }
        sc.close();

    }
}
