package Test;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tables to be found out: ");
        int n = sc.nextInt();
        System.out.print("Enter the limit to find : ");
        int l = sc.nextInt();;
        for (int i = 1; i <=l ; i++) {
            System.out.println(n+"*"+i+"="+n*i);

        }
        sc.close();
    }
    
}
