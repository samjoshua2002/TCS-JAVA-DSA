package ShakeenGang;

public class OddLetterPattern {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int length = word.length();
        int mid = length / 2;

       
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == length - i - 1) {
                    System.out.print(word.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == length - i - 1) {
                    System.out.print(word.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
