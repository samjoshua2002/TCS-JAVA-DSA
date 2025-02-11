import java.util.*;



public class list {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(5);
        li.add(4);
        // System.out.println(li.toString());
       
//        for (int i = 0; i < args.length; i++) {
//         System.out.println(li.get(i));
//        }
// int count =0;
// while (count< li.size()) {
//     System.out.println(li.get(count));
//     count++;
// }

// //iterator
// java.util.Iterator<Integer> it = li.iterator();
// while (it.hasNext()) {
//     System.out.println(it.next());
    
// }
// li.forEach(System.out::println);
li.stream().filter(e->e%2==0).forEach(System.out::println);
    }
}
