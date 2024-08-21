package ShakeenGang;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}

// import java.util.HashMap;

// public class TwoSum {

//     // Method to calculate the indices of the two numbers that add up to the target
//     public static int[] calculate(int[] nums, int target) {
//         // Create a hashmap to store the complement and its index
//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Iterate over the array
//         for (int i = 0; i < nums.length; i++) {
//             // Calculate the complement
//             int complement = target - nums[i];

//             // Check if the complement is already in the map
//             if (map.containsKey(complement)) {
//                 // Return the indices if the complement is found
//                 return new int[] { map.get(complement), i };
//             }

//             // Otherwise, add the current number and its index to the map
//             map.put(nums[i], i);
//         }

//         // If no solution is found, return an empty array
//         return new int[] {};
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = calculate(nums, target);

//         // Print the result
//         if (result.length > 0) {
//             System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
//         } else {
//             System.out.println("No solution found.");
//         }
//     }
// }
