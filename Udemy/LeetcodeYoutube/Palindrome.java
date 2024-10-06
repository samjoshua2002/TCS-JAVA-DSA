package Udemy.LeetcodeYoutube;

public class Palindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        int start = 0;
        int ends = str.length() - 1;

        while (start < ends) {
            // If both characters are letters, compare them
            if (Character.isLetter(str.charAt(start)) && Character.isLetter(str.charAt(ends))) {
                if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(ends))) {
                    System.out.println("Not a palindrome");
                    return; // Exit the function if not a palindrome
                }
                start += 1;
                ends -= 1;
            }
            // If both characters are digits, compare them
            else if (Character.isDigit(str.charAt(start)) && Character.isDigit(str.charAt(ends))) {
                if (str.charAt(start) != str.charAt(ends)) {
                    System.out.println("Not a palindrome");
                    return;
                }
                start += 1;
                ends -= 1;
            }
 if (!Character.isLetterOrDigit(str.charAt(start))) {
                start += 1;
            }

            else if (!Character.isLetterOrDigit(str.charAt(ends))) {
                ends -= 1;
            }
        }
        System.out.println("The string is a palindrome");
    }
}
