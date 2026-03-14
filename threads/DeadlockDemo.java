package threads;

public class DeadlockDemo {
    static final Object accountA=new Object();
    static final Object accountB=new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Thread 1 locked accountA ");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}

                synchronized (accountB) {
                    System.out.println("Thread 1 locked accountB ");
                }
            }
        });
        Thread t2 =new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Thread 2 locked accountA ");

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
                synchronized (accountA) {
                    System.out.println("Thread 2 locked accountB ");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
/*
Thread  -1 acquires a lock on AccountA and then sleeps ,giving
Thread -2 to acquire a lock on Account B .Now ,Thread -1 waits for
Account A & thread-2 waits for Account B .Since neither thread
releases the lock ,both keep waiting  and creating a DEADLOCK.

 DEADLOCK Explaination : Deadlock occurs when each thread is holding
 a resource & waiting for the other to release it.
 */