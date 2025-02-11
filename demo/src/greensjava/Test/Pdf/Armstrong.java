package greensjava.Test.Pdf;

import java.util.Scanner;
import java.util.TreeSet;

public class Armstrong {
    public static TreeSet<Integer> armstrong(int digit){
        int original =digit;
        TreeSet<Integer> arr = new TreeSet<>();

        int val=0;
        while (digit!=0){
            int num= digit%10;
            val= val+(num*num*num);
            digit/=10;
        }
        if (original==val){
            arr.add(original);
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit to find the armstrong number: ");
        int digit= sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        for (int i = 1; i <=digit ; i++) {
            a.addAll(armstrong(i));

        }
        System.out.println("The total number of armstrong number from 1 to "+digit+" is: "+a.size());
        System.out.println();
        System.out.println("They are :");
        System.out.println(a);
    }
}
