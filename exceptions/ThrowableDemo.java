package exceptions;

public class ThrowableDemo {
    static void test() throws Throwable{
        throw  new Throwable("Something went wrong");
    }

    public static void main(String[] args) {
        try{
            test();
        }
        catch (Throwable t){
            //Fully qualified class name+ message
            System.out.println("Handled" + t);
            //Only the message.
            System.out.println("Handled "+t.getMessage());
        }
    }
}
/*
throw new String("Error");-->NP
throw new Integer("Error");-->NP
throw new Throwable("Error")-->Yes
throw new Exception("Error")-->Yes
throw new RuntimeError("Error")--Yes
throw new IOException("Error")-->Yes
*/