public class staircase {
    static int fib(int sa){
        if (sa<=1){
            return sa;
        } return fib(sa-1) + fib(sa-2);

    }
    static int increment(int a)
    {
        return fib(a+1);

    }
    public static void main(String[] args) {
        
        int s =4;
        System.out.println(increment(s));
    }
}
/*+
 public class staircase {
    // nth element
    static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
 
    static int countWays(int s) {
        return fib(s + 1);
    }
 
    public static void main(String[] args) {
        // ways(n) = ways(n - 1) + ways(n - 2)
        int s = 4;
        System.out.println("Total ways: " + countWays(s));
    }
}
 */