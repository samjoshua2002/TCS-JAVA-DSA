package ShakeenGang;

import java.util.*;

public class FamilyTree {

    public static void main(String[] args) {
        // Sample data
        String[][] relationships = {
            {"luke", "shaw"},
            {"wayne", "rooney"},
            {"rooney", "ronaldo"},
            {"shaw", "rooney"}
        };

        // Build family tree
        Map<String, Set<String>> childrenMap = new HashMap<>();
        for (String[] relationship : relationships) {
            String child = relationship[0];
            String father = relationship[1];

            // Add the child to the father's list of children
            childrenMap.computeIfAbsent(father, k -> new HashSet<>()).add(child);
        }

        // Specify the person to find grandchildren for
        String person = "ronaldo";
        int numberOfGrandchildren = findNumberOfGrandchildren(childrenMap, person);
        
        System.out.println("Number of grandchildren for " + person + ": " + numberOfGrandchildren);
    }

    // Method to find the number of grandchildren for a given person
    public static int findNumberOfGrandchildren(Map<String, Set<String>> childrenMap, String person) {
        Set<String> grandchildren = new HashSet<>();

        // Find all children of the given person
        Set<String> children = childrenMap.get(person);
        if (children != null) {
            for (String child : children) {
                // Find children of each child (i.e., grandchildren)
                Set<String> childChildren = childrenMap.get(child);
                if (childChildren != null) {
                    grandchildren.addAll(childChildren);
                }
            }
        }

        return grandchildren.size();
    }
}
