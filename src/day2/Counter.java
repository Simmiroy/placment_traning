package day2;

public class Counter {
    static int count=0;
    int id;
    Counter(){
        count++;
        id=count;
        System.out.println("ID=" + id);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);
    }

}
