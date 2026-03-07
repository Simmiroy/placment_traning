package collection.maps;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht=new Hashtable<>();
        ht.put(106,"uno");
        ht.put(100,"yami");
        ht.put(117,"krish");
        ht.put(99,"popsy");
        ht.put(101,"jolly");
        ht.put(128,"Priya");
        System.out.println(ht.getOrDefault(101,"Not found"));
        System.out.println(ht.getOrDefault(200,"Not found"));
        ht.putIfAbsent(104,"Gaurav");  //This will be added.
        System.out.println("Updated Table: "+ht);
        ht.putIfAbsent(99,"Ram");      //This won't be added.
        System.out.println("Updated Table: "+ht);
    }
}
