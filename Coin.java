import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the bills separated by spaces:");
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }   boolean possible = true;
            int five = 0, ten = 0;
            
            OUTER:
            for (int bills : arr) {
                switch (bills) {
                    case 5 -> five++;
                    case 10 -> {
                        if (five == 0) {
                            possible = false;
                            break OUTER;
                        }
                        five--;
                        ten++;
                    }
                    default -> {
                        if (five > 0 && ten > 0) {
                            five--;
                            ten--;
                        } else if (five >= 3) {
                            five -= 3;
                        } else {
                            possible = false;
                            break OUTER;
                        }
                    }
                }
            }   if (possible) {
                System.out.println("Yes, it's possible with available bills");
            } else {
                System.out.println("No sufficient balance");
            }
        }
    }
}
