package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders =new LinkedList<>();
        //for add : add() ->Strict[Fail] offer()-> NotStrict[Fail]
        orders.offer("Orders181");              //Flexible
        orders.add("Orders485");                       //Strict Capicity Based
        System.out.println("Orders: "+orders);
        //for removal : remove() ->Strict[Fail] poll()-> NotStrict[Fail]
        System.out.println("Serving: "+orders.poll());
        System.out.println("Pending Order: "+orders);
        System.out.println(orders.element()); // output will be the peek element.
    }
}
