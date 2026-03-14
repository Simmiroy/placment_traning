package garbage;

public class GDemo {
    public static void main(String[] args) {
        GDemo obj = new GDemo();
        obj=null;
        System.gc(); // not mandatory.

        /*Now -a- days the gc() method is automatically invoked after program execution by the object class for clutter,
        garbage collection and renewal,  we dont need to do .
        */
        System.out.println("GC Requested");
    }
}
