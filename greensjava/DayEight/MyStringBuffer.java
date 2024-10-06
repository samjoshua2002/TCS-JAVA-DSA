package greensjava.DayEight;

public class MyStringBuffer {
    public static void main(String[] args) {
        String str ="shree";
        StringBuilder obj = new StringBuilder(str);


        obj.append("madhi");
        System.out.println("After append: " + obj);


        obj.insert(5, "-");
        System.out.println("After insert: " + obj);


        obj.replace(0, 5, "Lord");
        System.out.println("After replace: " + obj);


        obj.delete(4, 6);
        System.out.println("After delete: " + obj);


        obj.setCharAt(0, 'S');
        System.out.println("After update (setCharAt): " + obj);
    }
}
