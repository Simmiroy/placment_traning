package exceptions;

public class Demo {
    public static void main(String[] args) {
        try{
            int balance= 2000;
            int withdraw=3000;
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient Funds");
            }
            System.out.println("Withdra Successfful");
        }catch (ArithmeticException e){
            System.out.println("Caught Exception : " + e.getMessage());
        }
    }
}
/* If else block is not strict.
* but throw new  excpetion is strict soo if we exception it will not print next line directly goes to catch block. */