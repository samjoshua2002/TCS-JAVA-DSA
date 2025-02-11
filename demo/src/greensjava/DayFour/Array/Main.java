package greensjava.DayFour.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] color ={"pink","yellow","red"};
        System.out.println(Arrays.toString(color));
        System.out.println(color[1]);
        for (String string : color) {
            System.out.print(string+" ");
            
        }
    }
    
}
