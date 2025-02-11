package ShakeenGang;

public class ReverseTheString {
    public static void main(String[] args) {
        // String s="Hello";
        // String r="";
        // for (int i = s.length()-1; i>=0; i--) {
        //     r+= s.charAt(i);

            
        // }
        // System.out.println(r);
        String s="civic";
        String reverse=new StringBuilder(s).reverse().toString();
        if (s.equals(reverse)) {
            System.out.println("Yes its a palindrome");
            
        }
    }

}
