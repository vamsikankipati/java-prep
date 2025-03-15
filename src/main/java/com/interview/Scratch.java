package com.interview;


import java.util.*;
import java.util.stream.Collectors;

public class Scratch {
    public static void main(String[] args) {
        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");
        Item item4 = new Item("Item 4");
        Item item5 = new Item("Item 5");


        ShoppingCart cart1 = new ShoppingCart(1, "John Doe");
        cart1.addToCart(item1, item2, item4);

        ShoppingCart cart2 = new ShoppingCart(2, "Jane Doe");
        cart2.addToCart(item2, item4, item3, item1);

        ShoppingCart cart3 = new ShoppingCart(3, "Jimmy Doe");
        cart3.addToCart(item3, item4);

        ShoppingCart cart4 = new ShoppingCart(4, "Jenny Doe");
        cart4.addToCart(item5);

        List<ShoppingCart> carts = new ArrayList<>();
        carts.add(cart1);
        carts.add(cart2);
        carts.add(cart3);
        carts.add(cart4);
        System.out.println(findHighest(carts));
    }

    private static String findHighest(List<ShoppingCart> carts) {
        Map<String, Integer> cartMap = new HashMap<>();
        carts.stream().forEach(cart -> {
            cart.cartItems.stream().forEach(item -> {
                if (!cartMap.containsKey(item)) {
                    cartMap.put(item.name, 1);
                } else {
                    cartMap.put(item.name, cartMap.get(item) + 1);
                }
            });
        });
        List<Map.Entry<String, Integer>> result = cartMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        return result.get(0).getKey();
    }
}



class ShoppingCart {
    int id;
    String customerName;
    List<Item> cartItems;

    public ShoppingCart(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(Item... items) {
        cartItems.addAll(Arrays.asList(items));
    }
}

class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }
}