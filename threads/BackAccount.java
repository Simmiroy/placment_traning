package threads;

public class BackAccount {
    int balance=10000;
     void withdraw (int amount){
         balance-=amount;
    }

    public static void main(String[] args) throws InterruptedException{
        BackAccount acc=new BackAccount();
        Thread t1=new Thread(() -> acc.withdraw(500));
        Thread t2=new Thread(() -> acc.withdraw(6000));
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();

        //join() will make sure that the thread
        //waits for the child threads to complete.
        System.out.println("Final Balance " + acc.balance);
    }
}
/*
* Both the threads t1 & t2 access &modify the same balance variable
 simultaniously.Due to lack of synchronization ,the final balance becomes inconsistant

 *Points to remember
 * Shared data causes issues
 * Execution order is unpredicatbale
 * leads todata incosistency
 * Need synchronization to solve the RACE CONDITION. */