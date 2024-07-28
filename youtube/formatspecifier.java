package youtube;

public class formatspecifier {
    public static void main(String[] args) {
        boolean myBoolean = true;
        char myChar = 'A';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000.0; 
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);
    }
}
