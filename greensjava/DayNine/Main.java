package greensjava.DayNine;

import java.util.*;

class  topics{
    protected void Arraylist(){
        ArrayList<String> obj = new ArrayList<>();
        obj.add("sam");
        obj.add("Shakeen");
        obj.add("Sanjay");
        obj.add("Sriram");
        obj.set(2,"Sanjay Kumar");
        System.out.println(obj);
        System.out.println("After removing Sriram");
        obj.remove(3);
        System.out.println(obj);
    }
    public void Map(){
        Map <String,String> maps = new HashMap<>();
        maps.put("Sam","a+");
        maps.put("Sanjay","a");
        maps.put("Shakeen","o");
        maps.put("Sriram","b+");
        maps.replace("Sam","o");
        System.out.println(maps);

    }
    public static void Linkedlisteg(){
        LinkedList<String> obj = new LinkedList<>();
        obj.add("sam");
        obj.add("Shakeen");
        obj.add("Sanjay");
        obj.add("Sriram");
        obj.set(2,"Sanjay Kumar");
        System.out.println(obj);
        System.out.println("After removing Sriram");
        obj.remove(3);
        System.out.println(obj);
        System.out.println("Insert at beginning:");
        obj.addFirst("Start");
        System.out.println(obj);
        System.out.println("Insert at end:");
        obj.addLast("End");
        System.out.println(obj);

    }
    public static void Hashset(){
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(7);
        set.add(78);
        set.add(72);
        set.add(71);
        System.out.println(set);


    }
    
    
    public void TreeMapEg(){
        Map <String,String> maps = new TreeMap<>();
        maps.put("Sam","a+");
        maps.put("Sanjay","a");
        maps.put("Ajay","a");
        maps.put("Bsrath","b+");
        maps.put("Shakeen","o");
        maps.put("Sriram","b+");
        maps.replace("Sam","o");
        System.out.println(maps);

    }


}

public class Main {
    public static void TreeSetEg(){
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(9);
        tree.add(8);
        tree.add(7);
        tree.add(6);
        tree.add(5);
        System.out.println(tree);
    }
    public static void main(String[] args) {
        topics t = new topics();
        System.out.println("ArrayList examples:");
        System.out.println();
        t.Arraylist();
        
        System.out.println("LinkedList examples:");
        topics.Linkedlisteg();
        System.out.println();
        System.out.println("HashSet examples:");
        topics.Hashset();
        System.out.println();
        System.out.println("TreeSet examples:");
        TreeSetEg();
        System.out.println();
        System.out.println("HashMap examples:");
        t.Map();
        System.out.println();
        System.out.println("TreeMap examples:");
        t.TreeMapEg();
        System.out.println();





    }
}
