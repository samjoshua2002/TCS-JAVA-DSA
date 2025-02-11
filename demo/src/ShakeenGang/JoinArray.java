package ShakeenGang;

import java.util.Arrays;

public class JoinArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
    int[] joine =new int[a.length + b.length];
        // System.arraycopy(a, 0, joine, 0, a.length);
        // System.arraycopy(b, 0, joine, a.length, b.length);
        for (int i = 0; i < a.length; i++) {
            joine[i] = a[i];
        }
        
        // Copy elements from array 'b' to 'joine'
        for (int i = 0; i < b.length; i++) {
            joine[a.length + i] = b[i];  // Corrected the index here
        }
    System.out.println(Arrays.toString(joine));
    }
}
