//import java.util.Scanner;
public class first {
    public static int main (int n){
////        int a=2;
////        int b=4;
////        a=a^b;
////        b=a^b;
////        a=a^b;
////        System.out.println( "a" +" " +"b " + b);
////        System.out.println(~5);
//        Scanner ob=new Scanner(System.in);
//        int a=ob.next();
////        System.out.println(5>>1);
//        System.out.println(a);
        int count=1;
         n=123;
        while(n>1){
            n=n/10;
            count++;
        }
        return count;

    }

}
