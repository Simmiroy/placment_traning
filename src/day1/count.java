package day1;

public class count {
    public static void main(String[] args) {
        int c=1;
        int n=123;
        while(n>1){
            n=n/10;
            c++;
        }
        System.out.println(c);
    }
}
