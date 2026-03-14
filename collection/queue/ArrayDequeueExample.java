package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("User types A  ");
        actions.addLast("User types B ");
        actions.addLast("User  Deletes B ");
        System.out.println("Undo: "+actions.removeLast());
        System.out.println("Remaining actions: "+ actions);
    }
}
