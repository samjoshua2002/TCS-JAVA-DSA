public class bintodecimal {
    public static void main(String[] args) {
        // Example binary number
        String binaryNumber = "00000010100101000001111010011100"; // This is binary for a large decimal number

        // Convert binary to decimal
        long decimalNumber = Long.parseLong(binaryNumber, 2);

        // Output the result
        System.out.println(decimalNumber);
        
    }
}
