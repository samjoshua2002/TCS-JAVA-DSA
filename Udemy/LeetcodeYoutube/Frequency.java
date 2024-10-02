package Udemy.LeetcodeYoutube;
import java.util.*;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number in Array: ");
    String result = sc.nextLine();
        System.out.println("Enter the frequency range: ");
        int k =sc.nextInt();
    String[] array = result.split(" ");
    int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
        arr[i] = Integer.parseInt(array[i]);
    }
        Map<Integer,Integer> count = new HashMap<>() ;
        for (int j : arr) {
            if (!count.containsKey(j)) count.put(j, 0);
            count.put(j, count.get(j) + 1);


        }
//        for(int s : count.keySet()){
//            System.out.println(s+"-->"+ count.get(s));
//        }
        Map<Integer,List<Integer>> reversecount = new HashMap<>();
        for (int c : count.keySet()){
            int value= count.get(c);
            if (!reversecount.containsKey(value))reversecount.put(value,new ArrayList<>());
            reversecount.get(value).add(c);


        }
        for (Map.Entry<Integer,List<Integer>> entry : reversecount.entrySet()) {
            System.out.println(entry.getKey() +"-->"+ entry.getValue());
            
        }






    }



}
