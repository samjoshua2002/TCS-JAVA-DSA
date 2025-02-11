import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = s.toLowerCase();
        int count = 0;

        for (Character ch : a.toCharArray()) {
            for (char vowel : vowels) {
                if (ch == vowel) {
                    count++;
                    
                }
            }
        }
        System.out.println("The total number of vowels in the string is: " + count);
        sc.close();
    }
}
