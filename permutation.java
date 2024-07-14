public class permutation {
    static int count = 0;
    static void perm(String str, String ans) {
        if(str.length() == 0) {
            count++;
            System.out.println(ans + ", " + count);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
            String s = str.substring(0, i) + str.substring(i + 1);
            // a + b --> ab
            // ch --> a
            perm(s, ans + ch);
        }
    }
 
    public static void main(String[] args) {
        perm("abb", "");
    }
}