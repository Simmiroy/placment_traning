package collection.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        System.out.println("Initial list: "+list);
        Collections.sort(list,(a,b)->a-b);
        System.out.println("Sorted list: "+ list);
        Collections.sort(list,(a,b)->b-a);
        System.out.println("Sorted list: "+list);
    }
}
