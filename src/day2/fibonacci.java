package day2;

public class fibonacci {
    public static void main(String[] args) {
        int ft = 0;
        int st = 1;
        int t = 8;
        System.out.println(ft);
        System.out.println(st);
        for (int i = 2; i < t; i++) {
            int th = ft + st;
            System.out.println(th);
            ft = st;
            st = th;
        }
    }
}