package youtube;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("what is your name");
        String name=sc.nextLine();
        System.out.println("enter your age");
        int age =sc.nextInt();
        sc.nextLine();
        System.out.println("the name of the person is "+ name);
        System.out.println("the age of the person is "+ age);
        sc.close();
    }
    
}
