package collection.Sets;
import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrde {
    public static void main(String[] args) {
        HashSet<Integer> s= new LinkedHashSet<>();
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(8);
        s.add(9);
        s.add(1);
        System.out.println(s);
    }
}
