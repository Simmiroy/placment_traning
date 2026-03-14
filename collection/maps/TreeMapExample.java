package collection.maps;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(2,"B");
        map.put(1,"A");
        map.put(3,"C");
        System.out.println(map);
    }
}
