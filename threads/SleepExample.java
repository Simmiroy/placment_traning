package threads;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Printing 1-10");
        for (int  i=1; i<=10; i++){
            System.out.println("Print: "+i);
            Thread.sleep(2000);
        }
        System.out.println("Done");
    }
}
/*
* Here, the Thread is paused for a fixed duration of time .
* The Thread doesn't lack anything and resumes after the given time.

 */