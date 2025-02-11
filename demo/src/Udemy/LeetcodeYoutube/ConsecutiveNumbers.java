package Udemy.LeetcodeYoutube;

import java.util.HashSet;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int[] array ={100,4,200,1,3,2};
        HashSet<Integer> set=new HashSet<>();
        for (int i : array)
            set.add(i);
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i]-1)) continue;
            int currentmax=0;
            while (set.contains(array[i])){
                array[i]+=1;
                currentmax+=1;



            }
            max= Math.max(currentmax,max);


        }
        System.out.println(max);


    }
}
