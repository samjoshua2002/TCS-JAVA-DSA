public class MethodDemo {
    static void displayGreetings() {
        System.out.println("Hello world!");
        System.out.println("Welcome, welcome.");
        System.out.println("Please make yourself at home.");
    }
    static void displayGreetings(int count) {

        for (int i=1; i <= count; i++) {
            displayGreetings();

            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayGreetings(3);
    }

    

    // define the method
    
}
