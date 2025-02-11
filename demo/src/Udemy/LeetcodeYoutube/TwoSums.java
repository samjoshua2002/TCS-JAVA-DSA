package Udemy.LeetcodeYoutube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static int[] answer(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (maps.containsKey(complement)) {
                return new int[] {maps.get(complement), i};
            } else {
                maps.put(nums[i], i); // Store the number and its index
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 6, 4};
        int target = 7;
        int[] arr = answer(num, target);
        System.out.println(Arrays.toString(arr)); // Print the result
    }
}
