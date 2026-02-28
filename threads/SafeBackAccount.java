package threads;

public class SafeBackAccount {
    int balance=10000;
    synchronized void withdraw (int amount){
        balance-=amount;
    }

    public static void main(String[] args) throws InterruptedException{
        SafeBackAccount acc=new SafeBackAccount();
        Thread t1=new Thread(() -> acc.withdraw(500));
        Thread t2=new Thread(() -> acc.withdraw(6000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //join() will make sure that the thread
        //waits for the child threads to complete.
        System.out.println("Final Balance " + acc.balance);
    }
}
/*Code explaination

The synchronization keyword ensures that only one thread can executes the withdraw()  operation
  at a time ,preventing RACE CONDITION and ensuring correct balance reduction.


  * Points to remember
  * Synchronization avoids RACE CONDITION
  * Locks critical is an application
  * Slower but safe
  * Essential for shared resources.
  */