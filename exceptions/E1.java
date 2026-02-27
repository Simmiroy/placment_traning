package exceptions;

public class E1 {
    public static void main(String[] args) {
        int i,j, k=0;
        i=10;
        j=0;
        try{
            k=i/j;
            int[] arr ={1,2,3,4,5};
            System.out.println(arr[9]);           //It will not reach to this this line because it will go to catch.
        }                                            //so we will apply one more catch then we will get the output.
        catch (ArithmeticException e){
            System.out.println("Cannot be divisible  by zero.");
            e.printStackTrace();  //details
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
        catch (Exception e){
            System.out.println("Somthing is unexpected.");        //This is for any unexpected
        }
        finally {
           System.out.println("End of Execution");
           System.out.println("Turn off DB");                           //
           System.out.println("Turn off Internet");
           System.out.println("Turn off Files");                      //finally block always executes last.
           System.out.println("Turn offDocker -Kubernetes");

        }
        System.out.println( "value of k is : " +k);
    }
    static {
        System.out.println("Start");
        System.out.println("Load DB");
        System.out.println("Load Internet");           //Static block always executes first.
        System.out.println("Load Files");
        System.out.println("Load Docker -Kubernetes");
    }
}
