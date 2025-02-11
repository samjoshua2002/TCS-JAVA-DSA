package Udemy.LeetcodeYoutube;


import java.util.Arrays;

public class TwoSumTwoPointer {
    public static int[] finder(int[] arr, int target){
        int left=0;
        int right= arr.length-1;
        Arrays.sort(arr);
        while (left<right){
            int currentsum = arr[left]+arr[right];
            if (currentsum ==target){
                return new int[]{left+1,right+1};
            } else if (currentsum> target) {
                right-=1;

            }
            else left+=1;
        }
        return null;




    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,6};
        int target=4;
        int[] res= finder(arr,target);
        System.out.println(Arrays.toString(res));

    }
}
