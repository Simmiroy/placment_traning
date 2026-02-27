package threads;

public class FestRegistration {
    static class FormFilling extends Thread{
        public void run(){
            System.out.println(" FormfillingStarted");
        }
    }
    static class Documentload extends Thread {
        public void run() {
            System.out.println(" Document upload Started");
        }
    }
        static class EmailNotification extends Thread{
            public void run(){
                System.out.println(" email sent");
            }

    }

    public static void main(String[] args) {
        FormFilling t1= new FormFilling();
        Documentload t2=new Documentload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*Points to remember
* Java program starts with main thread
* Threads allow parallel execution or concurrency.
* Output order is not guarented.
* Threads share the same memory
* It improves the performance and responsiveness
* When start() is called, the jvm creates a new Thread
* When run() is called, there is no concurrency
* Process is a Thread
* Process is a running program
* Thread : A part of execution inside the program
* A process has its own memory
* Threads share the same memory
* Creating a thread is cheaper
* example chrome and a new tab ... new tab can be closed
*/