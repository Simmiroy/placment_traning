package collection.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht= new Hashtable<>();
        ht.put(106,"uno");
        ht.put(100,"yami");
        ht.put(117,"krish");
        ht.put(99,"popsy");
        ht.put(101,"jolly");
        ht.put(128,"Priya");

        //ht.put(null,"Apu");
        for(Map.Entry<Integer,String> enrty: ht.entrySet()){
            System.out.println(enrty.getKey()+", "+ enrty.getValue());
        }

        System.out.println();

    }
}
//if it would be<String,Strng>... then it will be directly done by JVM
//Every string has unique hashcode which is done for calculationn & then give output accordingly