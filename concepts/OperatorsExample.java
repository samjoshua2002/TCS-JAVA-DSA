package concepts;

class OperatorsExample {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus
        System.out.println();

        // 2. Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println();

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT
        System.out.println();

        // 4. Bitwise Operators
        int m = 6;  // Binary: 0110
        int n = 4;  // Binary: 0100

        System.out.println("Bitwise Operators:");
        System.out.println("m & n: " + (m & n));   // Bitwise AND
        System.out.println("m | n: " + (m | n));   // Bitwise OR
        System.out.println("m ^ n: " + (m ^ n));   // Bitwise XOR
        System.out.println("~m: " + (~m));         // Bitwise Complement
        System.out.println("m << 1: " + (m << 1)); // Left shift
        System.out.println("m >> 1: " + (m >> 1)); // Right shift
        System.out.println();

        // 5. Assignment Operators
        int c;

        System.out.println("Assignment Operators:");
        c = a;      // Assign
        System.out.println("c = a: " + c);

        c += b;     // c = c + b
        System.out.println("c += b: " + c);

        c -= b;     // c = c - b
        System.out.println("c -= b: " + c);

        c *= b;     // c = c * b
        System.out.println("c *= b: " + c);

        c /= b;     // c = c / b
        System.out.println("c /= b: " + c);

        c %= b;     // c = c % b
        System.out.println("c %= b: " + c);
        System.out.println();
    }
}
