package Udemy;



public class overloaded {


static int add(int a, int b) {
System.out.println("This is overloaded method #1");
return a + b;
}

static int add(int a, int b, int c) {
System.out.println("This is overloaded method #2");
return a + b + c;
}
static int add(int a, int b, int c, int d) {
System.out.println("This is overloaded method #3");
return a + b + c + d;

}
    public static void main(String[] args) {
        int x = add(4, 7, 8, 9);
        System.out.println(x);
         
    }
}
