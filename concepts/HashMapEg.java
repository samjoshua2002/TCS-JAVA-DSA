package concepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEg {
    public static void main(String[] args) {

        Map<String, Integer> quantity = new TreeMap<>();


        quantity.put("apple"  , 10);
        quantity.put("mango"  , 20);
        quantity.put("grapes" , 10);
        quantity.put("banana" , 15);  // Adding more items for demonstration

        // Displaying all key-value pairs using keySet()
        System.out.println("Initial HashMap (using keySet):");
        for (String list : quantity.keySet()) {
            System.out.println(list + " -> " + quantity.get(list));
        }

        // Checking if a key exists
        System.out.println("\nDoes the map contain 'apple'? " + quantity.containsKey("apple"));

        // Checking if a value exists
        System.out.println("Does the map contain value 20? " + quantity.containsValue(20));

        // Removing an entry based on the key
        quantity.remove("banana");
        System.out.println("\nHashMap after removing 'banana':");
        for (String n : quantity.keySet()){
            System.out.println(n + "-->"+ quantity.get(n));
        }
        System.out.println("Now trying the same with map entity");

        for (Map.Entry<String, Integer> entry : quantity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Replacing the quantity of an existing item
        quantity.put("apple", 25); // You can use quantity.replace("apple", 25) as well
        System.out.println("\nUpdated quantity for 'apple':");
        System.out.println("apple -> " + quantity.get("apple"));

        // Iterating over HashMap using entrySet()
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<String, Integer> entry : quantity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Checking size of the HashMap
        System.out.println("\nSize of HashMap: " + quantity.size());

        // Clearing all entries in the HashMap

        boolean a = quantity.isEmpty();
        System.out.println("without clearing " + a );
        quantity.clear();
        System.out.println("after using the clear function : "+ quantity.isEmpty());
    }
}
