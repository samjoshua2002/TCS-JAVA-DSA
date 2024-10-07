package Udemy.LeetcodeYoutube;

import java.util.*;

public class ThreeSum {



    public static List<String> finder(int[] arr) {
        if (arr == null || arr.length < 3) return new ArrayList<>();
        Arrays.sort(arr);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i+1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum==0){
                    set.add(Arrays.asList(arr[i] , arr[left] , arr[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;

                }
                else right --;
            }

        }

        ArrayList<String> result = new ArrayList<>();
        for (List<Integer> a: set){
            result.add(a.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<String> result = ThreeSum.finder(arr);
        System.out.println(result);


    }
}
