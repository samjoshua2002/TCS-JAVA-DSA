package greensjava.Test.Pdf;

public class SumOfOddNum {
    public static void main(String[] args) {
        int counter=0;
        for (int i = 1; i <=100; i++) {
            if (i%2!=0) counter+=i;

        }
        System.out.println(counter);
    }
}
