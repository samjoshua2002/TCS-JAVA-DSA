package greensjava.Test;

import java.util.Scanner;

public class SwapWithTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE VALUE FOR X: ");

        int x= sc.nextInt();

        System.out.print("ENTER THE VALUE FOR Y: ");
        int y= sc.nextInt();

        int c =y;
        y=x;
        x=c;
        System.out.println("THE VALUE OF X CURRENTLY IS "+ x+" AND THE VALUE OF Y CURRENTLY IS "+ y);





    }
}
