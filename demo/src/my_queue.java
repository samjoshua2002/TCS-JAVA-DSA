import java.util.ArrayDeque;
import java.util.Queue;


public class my_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(4);
        q.offer(5);
        q.offer(8);
        q.offer(10);
        int remove =q.poll();
        System.out.println(remove);
        System.out.println(q.element());
    }
}
