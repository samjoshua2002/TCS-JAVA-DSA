package greensjava.Test.Pdf;

public class CountOfOddNumbers {
    public static void main(String[] args) {
        int counter=0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                counter = counter+1;
            }

        }
        System.out.println(counter);
    }
}
