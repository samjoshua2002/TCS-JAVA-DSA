package greensjava.DayThree.Polymorhism.Overriding;
class Cat{
    public void animals(){
        System.out.println("Meow meow");
    }
}
class Dog{
    public void animals(){
        System.out.println("Barks");
    }
}




public class Animal {
    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.animals();
        Dog dog = new Dog();
        dog.animals();
    }
}
