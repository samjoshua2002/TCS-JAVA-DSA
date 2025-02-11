package ShakeenGang;

public class OddLetterPattern {
    public static void main(String[] args) {
        String word="PROGRAM";
        int Length=word.length();
        int mid= Length/2;
        for (int i = 0; i <=mid; i++) {
            for( int j =0 ; j< Length; j++){
                if (j==i||j==Length-i-1) {
                    System.out.print(word.charAt(j));
                    
                }else{

                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        for (int i = mid-1; i >=0; i--) {
            for( int j =0 ; j< Length; j++){
                if (j==i||j==Length-i-1) {
                    System.out.print(word.charAt(j));
                    
                }else{

                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

    }
}
