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

public class Main {
    public static void main(String[] args) {
        // Define the input array and target value
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the twoSum method and store the result
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length > 0) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
