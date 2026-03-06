package collection.BASE;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders =new ArrayList<>();
        //next orders are added.
        liveOrders.add("101");
        liveOrders.add("102");
        liveOrders.add("Order05");
        System.out.println(liveOrders.contains("101"));
        System.out.println("Live orders:" + liveOrders);
        liveOrders.clear();
        System.out.println("live order"+liveOrders);
    }
}
