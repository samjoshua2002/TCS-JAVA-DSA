package greensjava.DayEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

class MathematicOperations {
    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Subtraction(int x, int y) {
        return x - y;
    }

    public static int Multiplication(int x, int y) {
        return x * y;
    }

    public static int Division(int x, int y) {
        return x / y; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        try {
            System.out.print("Enter first number (x): ");
            int x = scanner.nextInt();
            System.out.print("Enter second number (y): ");
            int y = scanner.nextInt();

            System.out.println("Addition: " + MathematicOperations.Addition(x, y));
            System.out.println("Subtraction: " + MathematicOperations.Subtraction(x, y));
            System.out.println("Multiplication: " + MathematicOperations.Multiplication(x, y));
            System.out.println("Division: " + MathematicOperations.Division(x, y));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers.");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
