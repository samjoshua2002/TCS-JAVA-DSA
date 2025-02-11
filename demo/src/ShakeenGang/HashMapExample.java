package ShakeenGang;

import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("sam", 21);
        map.put("sanjay", 22);
        map.put("shakeen", 23);
        map.put("sandeep", 24);

        // put() method
        System.out.println("Examples for put:");
        System.out.println(map);
        System.out.println();

        // containsKey() and containsValue() methods
        System.out.println("Examples for containsKey and containsValue (returns true or false):");
        System.out.println(map.containsKey("sam"));   // true
        System.out.println(map.containsValue(23));    // true
        System.out.println();

        // replace() method
        System.out.println("Example for replace:");
        System.out.println(map.replace("sam", 233));  // Replaces "sam"'s value with 233
        System.out.println(map);                      // {shakeen=23, sandeep=24, sanjay=22, sam=233}
        System.out.println();

        // computeIfAbsent() method
        System.out.println("Example for computeIfAbsent:");
        map.computeIfAbsent("newKey", k -> 100);      // Adds "newKey" with value 100 if not present
        System.out.println(map);                      // {shakeen=23, sandeep=24, sanjay=22, sam=233, newKey=100}
        System.out.println();

        // get() method
        System.out.println("Example for get:");
        System.out.println(map.get("sanjay"));        // 22
        System.out.println(map.get("nonexistent"));   // null
        System.out.println();

        // remove() method
        System.out.println("Example for remove:");
        map.remove("sandeep");                        // Removes "sandeep"
        System.out.println(map);                      // {shakeen=23, sanjay=22, sam=233, newKey=100}
        System.out.println();

        // keySet() method
        System.out.println("Example for keySet:");
        System.out.println(map.keySet());             // [shakeen, sanjay, sam, newKey]
        System.out.println();

        // values() method
        System.out.println("Example for values:");
        System.out.println(map.values());             // [23, 22, 233, 100]
        System.out.println();

        // entrySet() method
        System.out.println("Example for entrySet:");
        System.out.println(map.entrySet());           // [shakeen=23, sanjay=22, sam=233, newKey=100]
        System.out.println();

        // size() method
        System.out.println("Example for size:");
        System.out.println(map.size());               // 4
        System.out.println();

        // isEmpty() method
        System.out.println("Example for isEmpty:");
        System.out.println(map.isEmpty());            // false
        System.out.println();

        // clear() method
        System.out.println("Example for clear:");
        map.clear();                                  // Clears all entries
        System.out.println(map.isEmpty());            // true
    }
}
