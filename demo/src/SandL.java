


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class SandL {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements : ");
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc. nextInt();
    HashSet<Integer>  set = new HashSet<>();
        for (int i = 0; i < a; i++) {
            set.add(sc.nextInt());

            
        }
        for (Integer integer : set) {
            list.add(integer);
            
        }
        System.out.println("The smallest element in array is:" + list.get(0));
        System.out.println("The Largest element in array is:" + list.getLast());
        sc.close();
    }
    
}
