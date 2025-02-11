package ShakeenGang;

import java.util.*;

public class WeightCalculator {
    public static int calculate(int i){
        int weight=0;
        if (Math.sqrt(i)== (int)Math.sqrt(i)) {
            weight+=5;
            
        }
        if(i%4==0 && i%6==0){
            weight+=4;
        }
        if (i%2==0) {
            weight+=3;
            
        }
        return weight;
    }
    public static void main(String[] args){
        int[] arr={10, 36, 54, 89, 12};
        List <int[]> word =new ArrayList<>();
        for (int i : arr) {
            int weight = calculate(i);
            word.add(new int[]{i,weight});
            
            
        }
        word.sort(Comparator.comparingInt(a-> a[1]));
        for (int[] is : word) {
            System.out.println(is[0]+","+is[1]);
            
        }

    }
}

    
//     // Method to calculate the weight of a given number
//     public static int calculateWeight(int num) {
//         int weight = 0;

//         // Check if the number is a perfect square
//         if (Math.sqrt(num) == (int)Math.sqrt(num)) {
//             weight += 5;
//         }

//         // Check if the number is a multiple of 4 and divisible by 6
//         if (num % 4 == 0 && num % 6 == 0) {
//             weight += 4;
//         }

        
//         if (num % 2 == 0) {
//             weight += 3;
//         }

//         return weight;
//     }

//     public static void main(String[] args) {
        
//         int[] numbers = {10, 36, 54, 89, 12};
//         List<int[]> weightedNumbers = new ArrayList<>();

        
//         for (int num : numbers) {
//             int weight = calculateWeight(num);
//             weightedNumbers.add( new int[]{num, weight});
//         }

//         // Sort the list based on the weight (index 1 of the array)
//         weightedNumbers.sort(Comparator.comparingInt(b -> b[1]));

//         // Print the numbers and their weights
//         for (int[] entry : weightedNumbers) {
//             System.out.println("<" + entry[0] + ", " + entry[1] + ">");
//         }
//     }
// }

