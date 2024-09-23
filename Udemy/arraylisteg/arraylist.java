package Udemy.arraylisteg;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> food =new ArrayList<>();
        food.add("dos");
        food.add("idly");
        food.add("chapati");
        food.set(2, "sushi");
        //food.remove(2);
        //food.clear();
        // for (int i = 0; i < food.size(); i++) {
        //     System.out.println(food.get(i));
            
        // }
        for (String string : food) {
            System.out.println(string);
            
        }
    }
}
