package concepts;



class BasicSyntaxExample {
    public static void main(String[] args) {
        // Primitive Data Types
        int age = 25;                    // Integer type
        char grade = 'A';                // Character type
        float price = 19.99f;            // Floating-point type
        boolean isJavaFun = true;        // Boolean type
        
        // Reference Data Types
        String name = "Shakeen";         // String type (Reference type)
        int[] scores = {85, 90, 95};     // Array type (Reference type)
        
        // Displaying values
        System.out.println("Primitive Data Types:");
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Price: $" + price);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println();

        System.out.println("Reference Data Types:");
        System.out.println("Name: " + name);
        System.out.println("Scores: ");
        for (int score : scores) {
            System.out.print(score+" ");
        }
    }
}
