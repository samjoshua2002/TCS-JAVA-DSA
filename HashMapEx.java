import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        int[] a={1,2,3,4,3,1,5,2};
        HashMap<Integer,Integer> ap =new HashMap<>();
        for(int n : a){
            ap.put(n,ap.getOrDefault(n, 0) + 1);
        }
        System.out.println(ap);
        for(Map.Entry<Integer,Integer> map: ap.entrySet()){
            if(map.getValue() == 1){
                System.out.println(map.getKey());
            }
        }
    }
}
