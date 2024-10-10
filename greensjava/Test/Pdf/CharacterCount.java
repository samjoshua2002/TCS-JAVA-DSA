package greensjava.Test.Pdf;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) {
            if (i == ' ') {
                continue;
            }
            if (!map.containsKey(i)) map.put(i, 0);
            map.put(i, map.get(i) + 1);
        }

        System.out.println(map);
        sc.close();  // Closing the scanner to avoid resource leaks
    }
}
