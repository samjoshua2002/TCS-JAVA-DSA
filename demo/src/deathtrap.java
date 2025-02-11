
import java.util.ArrayList;
import java.util.List;
 
public class deathtrap {
    static void josh(List<Integer> person, int k, int index) {
        if(person.size() == 1) {
            System.out.println(person.get(0)); // last survival
            return;
        }
        index = (index + k) % person.size(); // to find the index of the person to kill
        person.remove(index);
        josh(person, k, index);
    }
 
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        k--;
        int index = 0;
 
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
 
        josh(list, k, index);
    }
}
 