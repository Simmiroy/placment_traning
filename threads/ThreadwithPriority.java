package threads;

public class ThreadwithPriority extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName()+"| Priority: " +Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadwithPriority t1= new ThreadwithPriority();
        ThreadwithPriority t2= new ThreadwithPriority();
        ThreadwithPriority t3= new ThreadwithPriority();
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(11);       *IlligalArgumentException*
        t1.start();
        t2.start();
        t3.start();

    }
}
/*
Points to remember:
Thread priority is only a suggestion to the JVM or the scheduler.
Higher priority does'nt guarentee execution order.
Higher priority thread may get more CPU time.
The actual behaviour depends on the JVM & Operating System.

*/
