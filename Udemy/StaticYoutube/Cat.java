package Udemy.StaticYoutube;

public class Cat {
    private static int count =0;
    String name ;
    int age;
    int livesRemaining;  

public void meow(){
    System.out.println("meow");
}
public Cat(){
    count++;
}
public static int get(){
    return count;
}
}
// static will be access through class name
// non static will be access through objects
// non static is used when it is meaningful 
//static is used when it need to be shared across multiple classes