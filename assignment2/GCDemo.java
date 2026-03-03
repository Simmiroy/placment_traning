package assignment2;


public class GCDemo {
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GCDemo obj = new GCDemo();
        obj = null;

        System.gc();
        System.out.println("Requesting GC");
    }
}

