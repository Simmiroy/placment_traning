package collection.Sets;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores=new TreeSet<>(Collections.reverseOrder());
        scores.add(56);
        scores.add(32);
        scores.add(89);
        scores.add(12);
        scores.add(10);
        System.out.println(scores);
    }
}
