package collection.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        //The values can be duplicates , but keys have to be unique.
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("011", "aaaa");
        hashmap.put("032", "bbb");
        hashmap.put("014", "zzzz");
        hashmap.put("012", "xxxx");
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " ," + entry.getValue());
        }
        System.out.println();
        //The values can be duplicates , but keys have to be unique.
        Map<String, String> hashmap1 = new LinkedHashMap<>();
        hashmap1.put("016", "aaaa");
        hashmap1.put("037", "bbb");
        hashmap1.put("015", "zzzzz");
        hashmap1.put("012", "xxxx");
        for (Map.Entry<String, String> entry : hashmap1.entrySet()) {
            System.out.println(entry.getKey() + " ," + entry.getValue());
        }
    }
}

