package greensjava.Test.Pdf;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int digit=1234;
        int rem =0;
        while (digit!=0){
            int num = digit%10;
            rem= rem*10+num;
            digit /=10;
        }
        System.out.println(rem);

    }
}
