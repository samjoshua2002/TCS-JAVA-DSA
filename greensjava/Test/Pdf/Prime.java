package greensjava.Test.Pdf;

import java.util.Scanner;
import java.util.TreeSet;

public class Prime {


    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit to find prime numbers: ");
        int limit = sc.nextInt();

        TreeSet<Integer> primes = new TreeSet<>();
        if (limit == 1 || limit == 2) {
            primes.add(limit);
        }


        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }


        System.out.println("Prime numbers up to " + limit + ": " + primes);
        sc.close();
    }
}
