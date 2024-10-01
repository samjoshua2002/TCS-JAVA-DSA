package greensjava.DayFive;

public class Comparision {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number = 10;
        System.out.println("if-else Statement:");
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println();
        
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT
        System.out.println();
        
        // Corrected switch statement for number
        switch (number) {
            case 10:
                System.out.println("Here it is 10");
                break;
            default:
                System.out.println("Not a valid case");
                break;
        }
        
        // New switch statement for vowels
        char vowel = 'a'; // Change this to test other characters

        System.out.println("\nSwitch Statement for Vowels:");
        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(vowel + " is a vowel.");
                break;
            default:
                System.out.println(vowel + " is not a vowel.");
                break;
        }
    }
}
