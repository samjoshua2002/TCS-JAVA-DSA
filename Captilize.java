

import java.util.Scanner;

public class Captilize {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();
        // String a=s.toLowerCase();
        // System.out.println(a);
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]>=65 && c[i]<=90) {
                c[i]= (char)(c[i]+32);

                
            }
            
            
        }
        // System.out.println(Arrays.toString(c));
        String ans = new String(c);
        System.out.println(ans);
        
    }
    
}
