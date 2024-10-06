
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        // String reverse = new StringBuilder(s).reverse().toString();

        char[] array =s.toCharArray();
        int start=0;
        int end=array.length-1;
        boolean isPalindrome = true;
        while (start<end) {
            if (array[start]!=array[end]) {
                isPalindrome=false;
                break;
                
            }
            start++;
                end--;
            
        }
        if (isPalindrome) {
            System.out.println("Its palindrome");
            
        }
        else{
            System.out.println("Not an palidrome");
        }
        
    }
}
