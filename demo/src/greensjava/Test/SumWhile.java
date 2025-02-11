package greensjava.Test;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        System.out.print("Enter the number to loop and for its sum: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        int sum=0;
        System.out.println(" the sequence of numbers from 1 to "+ n+ " numbers");
        while (n>0){
            System.out.print(n+ " ");
            n--;
            sum+=n;
        }
        System.out.println();
        System.out.println("sum of 1 to "+n+" numbers is: "+ sum);

    }
}
