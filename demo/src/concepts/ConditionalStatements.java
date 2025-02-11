package concepts;

class ConditionalStatements {
    public static void main(String[] args) {
        // 1. if-else Statement
        int number = 10;
        System.out.println("if-else Statement:");
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println();

        // 2. switch-case Statement
        int day = 3;
        System.out.println("switch-case Statement:");
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        //         break;
        // }
        
        
        System.out.println();

        // 3. for Loop
        System.out.println("for Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        System.out.println();

        // 4. while Loop
        int count = 1;
        System.out.println("while Loop:");
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }
        System.out.println();

        // 5. do-while Loop
        int i = 1;
        System.out.println("do-while Loop:");
        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i <= 5);
        System.out.println();

        // 6. break Statement
        System.out.println("break Statement:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                break;  // Exit loop when j equals 3
            }
            System.out.println("j = " + j);
        }
        System.out.println();

        // 7. continue Statement
        System.out.println("continue Statement:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;  // Skip the iteration when k equals 3
            }
            System.out.println("k = " + k);
        }
    }
}
