package greensjava.DaySeven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();


        sc.nextLine();

        System.out.print("Enter the name: ");
        String b = sc.nextLine();


        System.out.println("Number entered: " + a);
        System.out.println("Name entered: " + b);
    }
}
