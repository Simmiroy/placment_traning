package threads;


//SYNCHRONIZATION

public class ResultDeclaration {
    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval ...");
        wait();
        System.out.println("Result Declared");
    }
    synchronized void approve(){
        notify();
    }

    public static void main(String[] args) throws InterruptedException{
        ResultDeclaration rd=new ResultDeclaration();
        new Thread(() -> {
                    try {
                        rd.declareResult();
                    } catch (Exception e) {}
                }).start();
        Thread.sleep(1000);
        new Thread(()->
            rd.approve()).start();

    }
}
/*
The declareResult() method waits until another thread calls notify()
During wait() , the thread releases the lack ,allowing other threads to enter the synchronized code.

  Points to remember
  sleep() --> time based
  wait() --> condition based
  wait() --> relases lack -->by checking the notify() method.
  wait() -->is used in inter-threaded comminication.
  Order placed-> preparaing ->Delivering ->Delivered

  */