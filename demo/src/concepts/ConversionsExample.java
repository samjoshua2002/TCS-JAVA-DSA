package concepts;

import java.util.Arrays;

public class ConversionsExample {
    public static void main(String[] args) {

        // 1. String to char[] (Character Array)
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        System.out.print("String to char[]: ");

        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println(); // for newline

        // 2. char[] to String Conversion
        char[] newCharArray = { 'H', 'e', 'l', 'l', 'o' };
        String newStr = new String(newCharArray);
        System.out.println("char[] to String: " + newStr);

        // 3. String to Integer Conversion
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("String to int: " + number);

        // 4. String to Double Conversion
        String doubleStr = "123.45";
        double doubleNum = Double.parseDouble(doubleStr);
        System.out.println("String to double: " + doubleNum);

        // 5. Integer to String Conversion
        int intNumber = 123;
        String intToStr = Integer.toString(intNumber);
        System.out.println("int to String: " + intToStr);

        // 6. Double to String Conversion
        double doubleNumber = 123.45;
        String doubleToStr = Double.toString(doubleNumber);
        System.out.println("double to String: " + doubleToStr);

        // 7. int[] to String Conversion
        int[] intArray = {1, 2, 3, 4, 5};
        String arrayToStr = Arrays.toString(intArray);
        System.out.println("int[] to String: " + arrayToStr);

        // 8. String to int[] Conversion (String of numbers separated by commas)
        String commaSeparatedNumbers = "1,2,3,4,5";
        String[] strArray = commaSeparatedNumbers.split(","); // Split by comma
        int[] convertedIntArray = new int[strArray.length]; // Create int array

        // Parse each String element into an int and store in the array
        for (int i = 0; i < strArray.length; i++) {
            convertedIntArray[i] = Integer.parseInt(strArray[i]);
        }

        // Output the converted int array
        System.out.print("String to int[]: ");
        for (int num : convertedIntArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
