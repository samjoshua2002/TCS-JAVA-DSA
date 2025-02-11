import java.util.HashSet;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 3, 1, 2, 1};
        HashSet<Integer> tree = new HashSet<>();
        TreeSet<Integer> tre = new TreeSet<>();
        
        for (int i : array) {
            tree.add(i);
            tre.add(i);
        }
        
        System.out.println(tree);
        System.out.println(tre);
    }
}


