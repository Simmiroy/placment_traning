package collection.list;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart= new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.remove("Mouse");                //removes the item
        cart.set(1,"Mechanical Keyboard");        //updates
        System.out.println( "Cart item: "+cart);
        System.out.println("Total size: "+cart.size());
    }
}
