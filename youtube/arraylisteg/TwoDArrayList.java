package youtube.arraylisteg;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Pasta");
        bakeryList.add("Donuts");
        
        ArrayList<String> productList = new ArrayList<>();
        productList.add("Tomatoes");
        productList.add("Ginger");
        productList.add("Onion");
        
        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Vanilla");
        drinksList.add("Chocolate");
        
        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);
        
        System.out.println(groceryList.get(0).get(0));
    }
}
