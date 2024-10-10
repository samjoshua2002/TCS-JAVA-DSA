package greensjava.Test.Pdf;

public class Reverse {
    public static void main(String[] args) {
        String s = "tenet";
        String reverse="";
        for (int i = 0; i < s.length() ; i++) {
            reverse=  s.charAt(i)+ reverse;


        }
        System.out.println((reverse.equals(s)) ? "palindrome": "Not a palindrome");
        System.out.println(reverse);
    }
}
