package DSA.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache <K,V> extends LinkedHashMap<K,V> {
    private final int capacity;
    public LRUCache(int capacity){
        //the 'true' of the end is the magic ingredient
        //It tells the map to roder itself by access time
        //not insertion time
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    //This is a built-in method in LinkedHashmap
    //We override it to tell Java exactly when to start
    //Kicking old items out

    protected boolean removeEldestEnrty(Map.Entry<K,V>eldest){
        //If the size bigger than our capacity , return true
        //(Kick the oldest out)
        return size()>capacity;
    }

    public static void main(String[] args) {
        //Let's build our 3-pair shoe rack
        LRUCache<String, String> shoeRack = new LRUCache<>(3);
        shoeRack.put("Mon" ,"Sneeakers");
        shoeRack.put("Tue" ,"Boots");
        shoeRack.put("wed" ,"Sandals");
        System.out.println("Rack Content: "+shoeRack);
        shoeRack.get("Mon");
        System.out.println("Thurs" +"Loafers");
        System.out.println("Rack after adding Loafers: " +shoeRack);
    }
}
