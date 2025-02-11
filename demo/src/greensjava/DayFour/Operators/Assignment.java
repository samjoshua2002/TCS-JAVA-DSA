package greensjava.DayFour.Operators;

public class Assignment {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c;
        

        System.out.println("Assignment Operators:");
        c = a;     
        System.out.println("c = a: " + c);

        c += b;     
        System.out.println("c += b: " + c);

        c -= b;    
        System.out.println("c -= b: " + c);

        c *= b;    
        System.out.println("c *= b: " + c);

        c /= b;     
        System.out.println("c /= b: " + c);

        c %= b;     
        System.out.println("c %= b: " + c);
        System.out.println();
    }
    
}
