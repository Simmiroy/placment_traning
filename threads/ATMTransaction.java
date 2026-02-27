package threads;

public class ATMTransaction extends Thread {
    public void run(){
        System.out.println("Processing");
    }

    public static void main(String[] args) {
        ATMTransaction t= new ATMTransaction();
        System.out.println("Thread state : " +t.getState()); //NEW
        t.start();
        System.out.println("Thread state after start :" + t.getState()); //RUNNABLE
    }

}
/*CODE EXPLANATION

* Initially the thread is in the NEW state.After calling start().
* it moves to RUNNABLE  and executes the run() method.
* The exact timing of the state changes on the JVM Scheduler.

*/