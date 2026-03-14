package day3;

public class Calculator {
    static void calci(int a, int b){
        System.out.println(a+b);
    }
    static void calci(double a,double b ){
        System.out.println(a*b);
    }
    static int calci(int a, int b, int c){
        return (a+b)/c;
    }

    public static void main(String[] args) {
        calci(5,8);
        calci(5.2,5.6);
        System.out.println(calci(4,5,6));
    }
}
