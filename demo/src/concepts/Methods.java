package concepts;

public class Methods {

    // Method 1: A simple method with no parameters and no return value
    public void greet() {
        System.out.println("Hello, welcome to the Java tutorial!");
    }

    // Method 2: A method with parameters and a return value
    public int add(int a, int b) {
        return a + b;
    }

    // Method 3: Method overloading - same method name, different parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 4: Method to demonstrate pass by value
    public void modifyValue(int x) {
        x = x + 10;
        System.out.println("Value inside method: " + x);
    }

    public static void main(String[] args) {
        Methods methods = new Methods();

        // Invoke Method 1
        methods.greet();

        // Invoke Method 2 with two parameters
        int sum = methods.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum);

        // Invoke Method 3 (overloaded method) with three parameters
        int sum2 = methods.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + sum2);

        // Demonstrate pass by value
        int originalValue = 20;
        System.out.println("Original value before method call: " + originalValue);
        methods.modifyValue(originalValue);  // Pass by value - the original value won't change
        System.out.println("Original value after method call: " + originalValue);
    }
}
