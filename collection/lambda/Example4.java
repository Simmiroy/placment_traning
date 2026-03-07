package collection.lambda;

import java.util.ArrayList;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(16);
        list.add(20);
        list.add(15);
        list.forEach(System.out::println);
        list.forEach(n-> System.out.println(n));  //lambda
    }
}
