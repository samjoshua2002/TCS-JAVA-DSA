package Udemy.LeetcodeYoutube;

public class WaterContainer {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = arr.length-1;
        int maximum=-1;
        while (left<right){
            int w =right-left;
            int h = Math.min(arr[left],arr[right]);
            maximum= Math.max(maximum, w*h);
            if (arr[left]< arr[right]){
                 left++;
            }
            else {
                right--;
            }
        }
        System.out.println(maximum);
    }
}
