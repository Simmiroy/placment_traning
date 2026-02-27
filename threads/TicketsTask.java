package threads;

public class TicketsTask implements Runnable {
    String task;
    TicketsTask(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task + " in progress");
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new TicketsTask("Seat aasignment"));
        Thread t2=new Thread(new TicketsTask("Payment Processing"));
        Thread t3=new Thread(new TicketsTask("Sms sent"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
* Each Runnable Object is a job , and the Thread class is
 resposnsible only for execution , which makes this approach
 cleaner & more flexible.

 * implements Runnable
 * Better design
 * Interviwer mostly ask this
 * Supports th multiple implements via interface
 */