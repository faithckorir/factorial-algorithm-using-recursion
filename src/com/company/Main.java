package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// create a hashMap
        Map<String, Boolean> myShoppingList= new HashMap<>();
        //initialize the hashmap with values
        myShoppingList.put("sugar",true);
        myShoppingList.put("soap",true);
        myShoppingList.put("oil",true);
        myShoppingList.put("salt",false);



 //print out keys and their values
        System.out.println(myShoppingList.toString());


        //check if the map is empty
        System.out.println(myShoppingList.isEmpty());
        //remove an item from the shopping list
        myShoppingList.remove("oil");
        //check the remaining elements
        System.out.println(myShoppingList.toString());

        //check the size of the shoppping list
        System.out.println(myShoppingList.size());

        //clear the shopping list
        //myShoppingList.clear();
    }
}
