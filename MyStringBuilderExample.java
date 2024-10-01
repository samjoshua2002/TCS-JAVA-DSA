public class MyStringBuilderExample {

    public static void main(String[] args) {
        // Create a StringBuilder object (sb) with an initial string "Hello"
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string to sb
        sb.append(" World");
        System.out.println("After append: " + sb.toString()); // Output: Hello World

        // Insert a string at index 5
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString()); // Output: Hello, World

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb.toString()); // Output: dlroW ,olleH

        // Delete characters from index 5 to 7
        sb.reverse(); // First reverse back to the original for clarity
        sb.delete(5, 7);
        System.out.println("After delete: " + sb.toString()); // Output: HelloWorld

        // Replace a portion of the string from index 5 to 10 with "Java"
        sb.replace(5, 10, "Java");
        System.out.println("After replace: " + sb.toString()); // Output: HelloJava

        // Get the current length of the string
        int length = sb.length();
        System.out.println("Length of the string: " + length); // Output: 9

        // Get the capacity of the StringBuilder
        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuilder: " + capacity); // Capacity is usually larger than the string's length

        
        sb.setLength(5);
        System.out.println("After setting length to 5: " + sb.toString());
    }
}
