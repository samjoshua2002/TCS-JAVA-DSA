package Udemy.LeetcodeYoutube;

import java.util.*;


public class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers in the array (space-separated): ");
        String result = sc.nextLine();
        System.out.println("Enter the frequency range (k): ");
        int k = sc.nextInt();
        
        // Step 1: Convert input string to integer array
        String[] array = result.split(" ");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int j : arr) {
            if (!countMap.containsKey(j)) {
                countMap.put(j, 0);
            }
            countMap.put(j, countMap.get(j) + 1);
        }
        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() +"-->"+ entry.getValue());
            
        }

       
        Map<Integer, List<Integer>> reversecount = new HashMap<>();
        for (int c : countMap.keySet()) {
            int value = countMap.get(c);
            if (!reversecount.containsKey(value)) {
                reversecount.put(value, new ArrayList<>());
            }
            reversecount.get(value).add(c);
        }
        for (Map.Entry<Integer,List<Integer>> entry : reversecount.entrySet()) {
            System.out.println(entry.getKey() +"-->"+ entry.getValue());
            
        }

      
        int[] results = new int[k];
        int index = 0;

       
        for (int possibleCount = arr.length; possibleCount >= 1; possibleCount--) {
            if (reversecount.containsKey(possibleCount)) {
                for (int n : reversecount.get(possibleCount)) {
                    if (index < k) {
                        results[index++] = n;
                    } else {
                        break; 
                    }
                }
            }
            if (index >= k) {
                break;
            }
        }

       
        System.out.println("Top " + k + " most frequent elements: " + Arrays.toString(results));
    }
   
        
    }

