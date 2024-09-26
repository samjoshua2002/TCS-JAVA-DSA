import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bills separated by spaces:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        boolean possible = true;
        int five = 0, ten = 0;

        

        for (int bills : arr) {
            if (bills == 5) {
                five++;
            } else if (bills == 10) {
                if (five == 0) {
                    possible = false;
                    break;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    possible = false;
                    break;
                }
            }
        }

        if (possible) {
            System.out.println("Yes, it's possible with available bills");
        } else {
            System.out.println("No sufficient balance");
        }

        scanner.close();
    }
}
