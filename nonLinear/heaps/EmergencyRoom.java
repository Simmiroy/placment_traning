package nonLinear.heaps;

        import java.util.PriorityQueue;
        import java.util.Queue;

public class EmergencyRoom {
    public static void main() {
        Queue<Integer> severity=new PriorityQueue<>();
        // 1->high priority
        // 2->low priority
        // 3->medium priority
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("the patient that gets operated first is patient"+severity.poll());
        System.out.println("patient in queue:"+severity);
    }
}