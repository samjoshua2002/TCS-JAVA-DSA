package greensjava.Test.Pdf;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String s="Hello how how are you";
        String[] arr = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String a : arr){
            if (!map.containsKey(a))map.put(a,0);
            map.put(a, map.get(a) + 1);

        }
        System.out.println(map);
    }
}
